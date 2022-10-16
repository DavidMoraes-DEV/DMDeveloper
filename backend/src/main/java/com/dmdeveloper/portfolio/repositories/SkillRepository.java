package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{

}
