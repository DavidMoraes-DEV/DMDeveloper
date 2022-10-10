package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
