package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.FormationDTO;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.repositories.FormationRepository;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;
import com.dmdeveloper.portfolio.services.exceptions.DataBaseException;
import com.dmdeveloper.portfolio.services.exceptions.ResourceNotFoundException;

@Service
public class FormationService {

	@Autowired
	private FormationRepository repository;
	
	@Autowired
	private ResumeRepository resumeRepository;
	
	
	@Transactional(readOnly = true)
	public List<FormationDTO> findAll () {

		List<Formation> list = repository.findAll();
		return list.stream().map(x -> new FormationDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public FormationDTO findById(Long id) {
		Optional<Formation> obj = repository.findById(id);
		Formation entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new FormationDTO(entity);
	}
	
	@Transactional
	public FormationDTO insert(FormationDTO dto) {
		Formation entity = new Formation();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new FormationDTO(entity);
	}

	public FormationDTO update(Long id, FormationDTO dto) {
		try {
		Formation entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new FormationDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);	
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Integrity Violation");
		}
	}

	private void copyDtoToEntity(FormationDTO dto, Formation entity) {
		entity.setName(dto.getName());
		entity.setInstitution(dto.getInstitution());
		entity.setInitFormation(dto.getInitFormation());
		entity.setEndFormation(dto.getEndFormation());
		entity.setStatus(dto.getStatus());
		
		Resume resume = resumeRepository.getOne(dto.getResumeId());
		entity.setResume(resume);
	}

}
