package com.dmdeveloper.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.repositories.FormationRepository;

@Service
public class FormationService {

	@Autowired
	private FormationRepository repository;
	
	@Transactional(readOnly = true)
	public List<Formation> findAll () {
		return repository.findAll();
	}
}
