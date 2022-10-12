package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.ResumeDTO;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;

@Service
public class ResumeService {

	@Autowired
	private ResumeRepository repository;
	
	@Transactional(readOnly = true)
	public List<ResumeDTO> findAll () {
		List<Resume> list = repository.findAll();
	
		return list.stream().map(x -> new ResumeDTO(x, x.getFormations(), x.getCourses(), x.getTechnologies())).collect(Collectors.toList());
	}
}
