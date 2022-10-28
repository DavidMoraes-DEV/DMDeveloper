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

import com.dmdeveloper.portfolio.dto.CategoryDTO;
import com.dmdeveloper.portfolio.dto.SkillDTO;
import com.dmdeveloper.portfolio.entities.Category;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.entities.Skill;
import com.dmdeveloper.portfolio.repositories.CategoryRepository;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;
import com.dmdeveloper.portfolio.repositories.SkillRepository;
import com.dmdeveloper.portfolio.services.exceptions.DataBaseException;
import com.dmdeveloper.portfolio.services.exceptions.ResourceNotFoundException;

@Service
public class SkillService {

	@Autowired
	private SkillRepository repository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ResumeRepository resumeRepository;
	
	@Transactional(readOnly = true)
	public List<SkillDTO> findAll() {
		List<Skill> list = repository.findAll();
		return list.stream().map(x -> new SkillDTO(x, x.getCategories())).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public SkillDTO findById(Long id) {
		Optional<Skill> obj = repository.findById(id);
		Skill entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new SkillDTO(entity, entity.getCategories());
	}
	
	@Transactional
	public SkillDTO insert(SkillDTO dto) {
		Skill entity = new Skill();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new SkillDTO(entity);
	}

	@Transactional
	public SkillDTO update(Long id, SkillDTO dto) {
		try {
		Skill entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new SkillDTO(entity);
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

	private void copyDtoToEntity(SkillDTO dto, Skill entity) {
		entity.setName(dto.getName());
		entity.setImgUrl(dto.getImgUrl());
		
		Resume resume = resumeRepository.getOne(dto.getResumeId());
		entity.setResume(resume);
		
		entity.getCategories().clear();
		for (CategoryDTO catDto : dto.getCategories()) {
			Category category = categoryRepository.getOne(catDto.getId());
			entity.getCategories().add(category);
		}
	}

}
