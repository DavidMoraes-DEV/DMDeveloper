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

import com.dmdeveloper.portfolio.dto.CourseDTO;
import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.repositories.CourseRepository;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;
import com.dmdeveloper.portfolio.services.exceptions.DataBaseException;
import com.dmdeveloper.portfolio.services.exceptions.ResourceNotFoundException;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
	
	@Autowired
	private ResumeRepository resumeRepository;

	@Transactional(readOnly = true)
	public List<CourseDTO> findAll() {
		List<Course> list = repository.findAll();
		
		return list.stream().map(x -> new CourseDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public CourseDTO findById(Long id) {
		Optional<Course> obj = repository.findById(id);
		Course entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new CourseDTO(entity);
	}
	
	@Transactional
	public CourseDTO insert(CourseDTO dto) {
		Course entity = new Course();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new CourseDTO(entity);
	}

	public CourseDTO update(Long id, CourseDTO dto) {
		try {
		Course entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new CourseDTO(entity);
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

	private void copyDtoToEntity(CourseDTO dto, Course entity) {
		entity.setName(dto.getName());
		entity.setInstitution(dto.getInstitution());
		entity.setDuration(dto.getDuration());
		entity.setCertificate(dto.getCertificate());
		
		Resume resume = resumeRepository.getOne(dto.getResumeId());
		entity.setResume(resume);
	
	}
	
}
