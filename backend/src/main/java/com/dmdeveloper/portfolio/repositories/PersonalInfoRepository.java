package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.PersonalInfo;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Long>{

}
