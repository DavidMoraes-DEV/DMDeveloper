package com.dmdeveloper.portfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.repositories.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	@Transactional(readOnly = true)
	public List<Course> findAll() {
		return repository.findAll();
	}
}
