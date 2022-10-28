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
import com.dmdeveloper.portfolio.dto.FormationDTO;
import com.dmdeveloper.portfolio.dto.PersonalInfoDTO;
import com.dmdeveloper.portfolio.dto.ResumeDTO;
import com.dmdeveloper.portfolio.dto.SkillDTO;
import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.entities.PersonalInfo;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.entities.Skill;
import com.dmdeveloper.portfolio.repositories.CourseRepository;
import com.dmdeveloper.portfolio.repositories.FormationRepository;
import com.dmdeveloper.portfolio.repositories.PersonalInfoRepository;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;
import com.dmdeveloper.portfolio.repositories.SkillRepository;
import com.dmdeveloper.portfolio.services.exceptions.DataBaseException;
import com.dmdeveloper.portfolio.services.exceptions.ResourceNotFoundException;

@Service
public class ResumeService {

	@Autowired
	private ResumeRepository repository;
	
	@Autowired
	private PersonalInfoRepository personalInfoRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private SkillRepository skillRepository;
	
	@Transactional(readOnly = true)
	public List<ResumeDTO> findAll () {
		List<Resume> list = repository.findAll();
	
		return list.stream().map(x -> new ResumeDTO(x, x.getPersonalInfos(), x.getFormations(), x.getCourses(), x.getSkills())).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ResumeDTO findById(Long id) {
		Optional<Resume> obj = repository.findById(id);
		Resume entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ResumeDTO(entity, entity.getPersonalInfos(), entity.getFormations(), entity.getCourses(), entity.getSkills());
	}
	
	@Transactional
	public ResumeDTO insert(ResumeDTO dto) {
		Resume entity = new Resume();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ResumeDTO(entity, entity.getPersonalInfos(), entity.getFormations(), entity.getCourses(), entity.getSkills());
	}

	@Transactional
	public ResumeDTO update(Long id, ResumeDTO dto) {
		try {
		Resume entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ResumeDTO(entity);
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

	private void copyDtoToEntity(ResumeDTO dto, Resume entity) {
		entity.setFileUrl(dto.getFileUrl());
		
		entity.getPersonalInfos().clear();
		entity.getFormations().clear();
		entity.getCourses().clear();
		entity.getSkills().clear();
		
		for (PersonalInfoDTO persDto : dto.getPersonalInfos()) {
			PersonalInfo personalInfo = personalInfoRepository.getOne(persDto.getId());
			entity.getPersonalInfos().add(personalInfo);
		}
		
		for (FormationDTO formDto : dto.getFormations()) {
			Formation formation = formationRepository.getOne(formDto.getId());
			entity.getFormations().add(formation);
		}
		
		for (CourseDTO courseDto : dto.getCourses()) {
			Course course = courseRepository.getOne(courseDto.getId());
			entity.getCourses().add(course);
		}
		
		for (SkillDTO skillDto : dto.getSkills()) {
			Skill skill = skillRepository.getOne(skillDto.getId());
			entity.getSkills().add(skill);
		}
		
	}

}
