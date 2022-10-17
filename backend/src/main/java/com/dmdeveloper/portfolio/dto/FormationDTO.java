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
	
	public FormationDTO () {
	}
	
	public FormationDTO (Formation entity) {
		id = entity.getId();
		name = entity.getName();
		institution = entity.getInstitution();
		initFormation = entity.getInitFormation();
		endFormation = entity.getEndFormation();
		status = entity.getStatus();
	}

	public FormationDTO(Long id, String name, String institution, Instant initFormation, Instant endFormation, String status) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.initFormation = initFormation;
		this.endFormation = endFormation;
		this.status = status;
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

	public void setStart(Instant initFormation) {
		this.initFormation = initFormation;
	}

	public Instant getEndFormation() {
		return endFormation;
	}

	public void setEnd(Instant endFormation) {
		this.endFormation = endFormation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
