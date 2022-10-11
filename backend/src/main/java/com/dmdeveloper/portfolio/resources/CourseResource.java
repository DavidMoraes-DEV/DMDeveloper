package com.dmdeveloper.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.portfolio.dto.CourseDTO;
import com.dmdeveloper.portfolio.services.CourseService;

@RestController
@RequestMapping(value = "/courses")
public class CourseResource {

	@Autowired
	public CourseService service;
	
	@GetMapping
	@Transactional(readOnly = true)
	public ResponseEntity<List<CourseDTO>> findAll () {
		
		List<CourseDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
