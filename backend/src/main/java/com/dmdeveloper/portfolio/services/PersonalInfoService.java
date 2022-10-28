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

import com.dmdeveloper.portfolio.dto.PersonalInfoDTO;
import com.dmdeveloper.portfolio.entities.PersonalInfo;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.repositories.PersonalInfoRepository;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;
import com.dmdeveloper.portfolio.services.exceptions.DataBaseException;
import com.dmdeveloper.portfolio.services.exceptions.ResourceNotFoundException;

@Service
public class PersonalInfoService {

	@Autowired
	private PersonalInfoRepository repository;
	
	@Autowired
	private ResumeRepository resumeRepository;
	
	@Transactional(readOnly = true)
	public List<PersonalInfoDTO> findAll () {
		
		List<PersonalInfo> list = repository.findAll();
		return list.stream().map(x -> new PersonalInfoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public PersonalInfoDTO findById(Long id) {
		Optional<PersonalInfo> obj = repository.findById(id);
		PersonalInfo entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new PersonalInfoDTO(entity);
	}
	
	@Transactional
	public PersonalInfoDTO insert(PersonalInfoDTO dto) {
		PersonalInfo entity = new PersonalInfo();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new PersonalInfoDTO(entity);
	}
	
	@Transactional
	public PersonalInfoDTO update(Long id, PersonalInfoDTO dto) {
		try {
		PersonalInfo entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new PersonalInfoDTO(entity);
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

	private void copyDtoToEntity(PersonalInfoDTO dto, PersonalInfo entity) {
		entity.setName(dto.getName());
		entity.setBirthDate(dto.getBirthDate());
		entity.setGenre(dto.getGenre());
		entity.setPhone(dto.getPhone());
		entity.setEmail(dto.getEmail());
		entity.setAddress(dto.getAddress());
		entity.setCep(dto.getCep());
		entity.setCity(dto.getCity());
		entity.setState(dto.getState());
		entity.setCnh(dto.getCnh());
		
		Resume resume = resumeRepository.getOne(dto.getResumeId());
		entity.setResume(resume);
	}

}
