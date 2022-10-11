package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;

import com.dmdeveloper.portfolio.entities.Technology;

public class TechnologyDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String imgUrl;
	
	public TechnologyDTO() {
	}
	
	public TechnologyDTO(Technology entity) {
		id = entity.getId();
		name = entity.getName();
		imgUrl = entity.getImgUrl();
	}

	public TechnologyDTO(Long id, String name, String imgUrl) {
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
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
	
}
