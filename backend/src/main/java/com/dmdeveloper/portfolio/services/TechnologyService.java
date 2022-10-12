package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.TechnologyDTO;
import com.dmdeveloper.portfolio.entities.Technology;
import com.dmdeveloper.portfolio.repositories.TechnologyRepository;

@Service
public class TechnologyService {

	@Autowired
	private TechnologyRepository repository;
	
	@Transactional(readOnly = true)
	public List<TechnologyDTO> findAll() {
		List<Technology> list = repository.findAll();
		return list.stream().map(x -> new TechnologyDTO(x, x.getCategories())).collect(Collectors.toList());
	}
}
