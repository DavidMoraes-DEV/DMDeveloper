package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
