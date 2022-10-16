package com.dmdeveloper.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmdeveloper.portfolio.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
