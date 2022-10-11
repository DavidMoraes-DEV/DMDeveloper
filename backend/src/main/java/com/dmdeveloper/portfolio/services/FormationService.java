package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.FormationDTO;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.repositories.FormationRepository;

@Service
public class FormationService {

	@Autowired
	private FormationRepository repository;
	
	@Transactional(readOnly = true)
	public List<FormationDTO> findAll () {

		List<Formation> list = repository.findAll();
		return list.stream().map(x -> new FormationDTO(x)).collect(Collectors.toList());
	}
}
