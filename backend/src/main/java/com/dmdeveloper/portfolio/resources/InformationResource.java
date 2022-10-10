package com.dmdeveloper.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.portfolio.entities.Information;
import com.dmdeveloper.portfolio.services.InformationService;

@RestController
@RequestMapping(value = "/informations")
public class InformationResource {

	@Autowired
	private InformationService service;
	
	@GetMapping
	private ResponseEntity<List<Information>> findAll () {
		List<Information> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}