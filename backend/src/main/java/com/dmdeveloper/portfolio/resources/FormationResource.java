package com.dmdeveloper.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.portfolio.dto.FormationDTO;
import com.dmdeveloper.portfolio.services.FormationService;

@RestController
@RequestMapping(value = "/formations")
public class FormationResource {

	@Autowired
	private FormationService service;
	
	@GetMapping
	public ResponseEntity<List<FormationDTO>> findAll () {
		List<FormationDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
