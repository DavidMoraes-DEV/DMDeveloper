package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;

import com.dmdeveloper.portfolio.entities.Course;

public class CourseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String institution;
	private Double duration;
	private String certificate;
	
	public CourseDTO() {
	}

	public CourseDTO (Course entity) {
		id = entity.getId();
		name = entity.getName();
		institution = entity.getInstitution();
		duration = entity.getDuration();
		certificate = entity.getCertificate();
	}
	
	public CourseDTO(Long id, String name, String institution, Double duration, String certificate) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.duration = duration;
		this.certificate = certificate;
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

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
}
