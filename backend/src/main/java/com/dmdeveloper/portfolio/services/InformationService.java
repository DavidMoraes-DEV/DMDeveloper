package com.dmdeveloper.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.entities.Information;
import com.dmdeveloper.portfolio.repositories.InformationRepository;

@Service
public class InformationService {

	@Autowired
	private InformationRepository repository;
	
	@Transactional(readOnly = true) 
	public List<Information> findAll() {
		return repository.findAll();
	}
	
}
