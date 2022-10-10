package com.dmdeveloper.portfolio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.services.ResumeService;

@RestController
@RequestMapping(value = "/resumes")
public class ResumeResource {

	@Autowired
	private ResumeService service;
	
	@GetMapping
	public ResponseEntity<List<Resume>> findAll() {
		List<Resume> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}