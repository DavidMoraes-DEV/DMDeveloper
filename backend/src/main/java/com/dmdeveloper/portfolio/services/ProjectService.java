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

import com.dmdeveloper.portfolio.dto.ProjectDTO;
import com.dmdeveloper.portfolio.entities.Project;
import com.dmdeveloper.portfolio.repositories.ProjectRepository;
import com.dmdeveloper.portfolio.services.exceptions.DataBaseException;
import com.dmdeveloper.portfolio.services.exceptions.ResourceNotFoundException;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProjectDTO> findAll () {
		
		List<Project> list = repository.findAll();
		return list.stream().map(x -> new ProjectDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ProjectDTO findById(Long id) {
		Optional<Project> obj = repository.findById(id);
		Project entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ProjectDTO(entity);
	}
	
	@Transactional
	public ProjectDTO insert(ProjectDTO dto) {
		Project entity = new Project();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ProjectDTO(entity);
	}

	public ProjectDTO update(Long id, ProjectDTO dto) {
		try {
		Project entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ProjectDTO(entity);
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

	private void copyDtoToEntity(ProjectDTO dto, Project entity) {
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setGitUrl(dto.getGitUrl());
		entity.setProjectImage(dto.getProjectImage());
		entity.setProjectUrl(dto.getProjectUrl());
	}

}
