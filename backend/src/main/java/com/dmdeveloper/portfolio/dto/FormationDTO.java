package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.time.Instant;

import com.dmdeveloper.portfolio.entities.Formation;

public class FormationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String institution;
	private Instant start;
	private Instant end;
	private String status;
	
	public FormationDTO () {
	}
	
	public FormationDTO (Formation entity) {
		id = entity.getId();
		name = entity.getName();
		institution = entity.getInstitution();
		start = entity.getStart();
		end = entity.getEnd();
		status = entity.getStatus();
	}

	public FormationDTO(Long id, String name, String institution, Instant start, Instant end, String status) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.start = start;
		this.end = end;
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

	public Instant getStart() {
		return start;
	}

	public void setStart(Instant start) {
		this.start = start;
	}

	public Instant getEnd() {
		return end;
	}

	public void setEnd(Instant end) {
		this.end = end;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
