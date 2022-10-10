package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Information;

public interface InformationRepository extends JpaRepository<Information, Long> {

}
