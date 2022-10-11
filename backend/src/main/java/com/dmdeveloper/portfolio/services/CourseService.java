package com.dmdeveloper.portfolio.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.dto.CourseDTO;
import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	@Transactional(readOnly = true)
	public List<CourseDTO> findAll() {
		List<Course> list = repository.findAll();
		
		return list.stream().map(x -> new CourseDTO(x)).collect(Collectors.toList());
	}
}
