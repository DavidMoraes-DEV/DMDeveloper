package com.dmdeveloper.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.entities.Technology;
import com.dmdeveloper.portfolio.repositories.TechnologyRepository;

@Service
public class TechnologyService {

	@Autowired
	private TechnologyRepository repository;
	
	@Transactional(readOnly = true)
	public List<Technology> findAll() {
		return repository.findAll();
	}
}
