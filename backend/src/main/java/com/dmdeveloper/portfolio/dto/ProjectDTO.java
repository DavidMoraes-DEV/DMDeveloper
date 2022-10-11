package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;

import com.dmdeveloper.portfolio.entities.Project;

public class ProjectDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	private String gitUrl;
	private String projectUrl;
	private String projectImage;
	
	public ProjectDTO () {
	}

	public ProjectDTO (Project entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		gitUrl = entity.getGitUrl();
		projectUrl = entity.getProjectUrl();
		projectImage = entity.getProjectImage();
	}
	
	public ProjectDTO(Long id, String name, String description, String gitUrl, String projectUrl, String projectImage) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.gitUrl = gitUrl;
		this.projectUrl = projectUrl;
		this.projectImage = projectImage;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGitUrl() {
		return gitUrl;
	}

	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}

	public String getProjectUrl() {
		return projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public String getProjectImage() {
		return projectImage;
	}

	public void setProjectImage(String projectImage) {
		this.projectImage = projectImage;
	}
	
}
