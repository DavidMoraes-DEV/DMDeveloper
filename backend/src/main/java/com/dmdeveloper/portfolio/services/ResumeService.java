package com.dmdeveloper.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;

@Service
public class ResumeService {

	@Autowired
	private ResumeRepository repository;
	
	@Transactional(readOnly = true)
	public List<Resume> findAll () {
		return repository.findAll();
	}
}
