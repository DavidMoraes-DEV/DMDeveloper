package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.InformationDTO;
import com.dmdeveloper.portfolio.entities.Information;
import com.dmdeveloper.portfolio.repositories.InformationRepository;

@Service
public class InformationService {

	@Autowired
	private InformationRepository repository;
	
	@Transactional(readOnly = true) 
	public List<InformationDTO> findAll() {
		List<Information> list = repository.findAll();
		
		return list.stream().map(x -> new InformationDTO(x)).collect(Collectors.toList());
	}
	
}
