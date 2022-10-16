package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.dmdeveloper.portfolio.entities.Category;
import com.dmdeveloper.portfolio.entities.Skill;

public class SkillDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String imgUrl;
	
	private Set<CategoryDTO> categories = new HashSet<>();
	
	public SkillDTO() {
	}
	
	public SkillDTO(Long id, String name, String imgUrl) {
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
	}
	
	public SkillDTO(Skill entity) {
		id = entity.getId();
		name = entity.getName();
		imgUrl = entity.getImgUrl();
	}

	public SkillDTO(Skill entity, Set<Category> categories) {
		this(entity);
		categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public Set<CategoryDTO> getCategories() {
		return categories;
	}
}
