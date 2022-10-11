package com.dmdeveloper.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.portfolio.dto.ProjectDTO;
import com.dmdeveloper.portfolio.services.ProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectResource {

	@Autowired
	private ProjectService service;
	
	@GetMapping
	public ResponseEntity<List<ProjectDTO>> findAll () {
		List<ProjectDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
