package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.dmdeveloper.portfolio.entities.Formation;

public class FormationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 5, max = 50, message = "Deve conter entre 5 e 50 caracteres")
	private String name;
	
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 5, max = 150, message = "Deve conter entre 5 e 150 caracteres")
	private String institution;
	
	@NotBlank(message = "Campo Obrigatório")
	@Past(message = "Aceita apenas data passada")
	private Instant initFormation;
	
	@NotBlank(message = "Campo Obrigatório")
	private Instant endFormation;
	
	@NotBlank(message = "Campo Obrigatório")
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
