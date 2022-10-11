package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.ProjectDTO;
import com.dmdeveloper.portfolio.entities.Project;
import com.dmdeveloper.portfolio.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProjectDTO> findAll () {
		
		List<Project> list = repository.findAll();
		return list.stream().map(x -> new ProjectDTO(x)).collect(Collectors.toList());
	}
}
