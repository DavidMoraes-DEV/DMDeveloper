package com.dmdeveloper.portfolio.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table( name = "tb_formation")
public class Formation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String institution;
	private String status;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant initFormation;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant endFormation;
	
	@ManyToOne
	@JoinColumn(name = "resume_id")
	private Resume resume;
	
	public Formation () {
	}

	public Formation(Long id, String name, String institution, Instant initFormation, Instant endFormation, String status, Resume resume) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.initFormation = initFormation;
		this.endFormation = endFormation;
		this.status = status;
		this.resume = resume;
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

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formation other = (Formation) obj;
		return Objects.equals(id, other.id);
	}
	
}
