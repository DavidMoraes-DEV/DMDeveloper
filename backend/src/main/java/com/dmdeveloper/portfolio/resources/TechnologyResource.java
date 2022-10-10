package com.dmdeveloper.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.portfolio.entities.Technology;
import com.dmdeveloper.portfolio.services.TechnologyService;

@RestController
@RequestMapping(value = "/technologies")
public class TechnologyResource {

	@Autowired
	private TechnologyService service;
	
	@GetMapping
	public ResponseEntity<List<Technology>> findAll () {
		List<Technology> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}