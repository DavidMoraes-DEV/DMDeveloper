package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.time.Instant;

import com.dmdeveloper.portfolio.entities.Formation;

public class FormationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String institution;
	private Instant initFormation;
	private Instant endFormation;
	private String status;
	private Long resumeId;
	
	public FormationDTO () {
	}
	
	public FormationDTO (Formation entity) {
		id = entity.getId();
		name = entity.getName();
		institution = entity.getInstitution();
		initFormation = entity.getInitFormation();
		endFormation = entity.getEndFormation();
		status = entity.getStatus();
		resumeId = entity.getResume().getId();
	}

	public FormationDTO(Long id, String name, String institution, Instant initFormation, Instant endFormation, String status, Long resumeId) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.initFormation = initFormation;
		this.endFormation = endFormation;
		this.status = status;
		this.resumeId = resumeId;
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

	public Instant getInitFormation() {
		return initFormation;
	}

	public void setInitFormation(Instant initFormation) {
		this.initFormation = initFormation;
	}

	public Instant getEndFormation() {
		return endFormation;
	}

	public void setEndFormation(Instant endFormation) {
		this.endFormation = endFormation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getResumeId() {
		return resumeId;
	}

	public void setResumeId(Long resumeId) {
		this.resumeId = resumeId;
	}
	
}
