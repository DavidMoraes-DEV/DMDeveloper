package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
