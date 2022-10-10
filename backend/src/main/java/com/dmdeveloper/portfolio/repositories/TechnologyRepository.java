package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Long>{

}
