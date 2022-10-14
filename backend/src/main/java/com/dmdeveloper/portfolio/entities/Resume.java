package com.dmdeveloper.portfolio.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_resume")
public class Resume implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fileUrl;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personal_info_id", referencedColumnName = "id")
	private PersonalInfo personalInfo;
	
	@OneToMany
	@JoinColumn(name = "resume_id")
	private Set<Formation> formations = new HashSet<>();
	
	@OneToMany
	@JoinColumn(name = "resume_id")
	private Set<Course> courses = new HashSet<>();
	
	@OneToMany
	@JoinColumn(name = "resume_id")
	private Set<Skill> skills = new HashSet<>();
	
	public Resume () {
	}

	public Resume(Long id, String fileUrl, PersonalInfo personalInfo) {
		this.id = id;
		this.fileUrl = fileUrl;
		this.personalInfo = personalInfo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public Set<Formation> getFormations() {
		return formations;
	}

	public Set<Course> getCourses() {
		return courses;
	}
	
	public Set<Skill> getSkills() {
		return skills;
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
		Resume other = (Resume) obj;
		return Objects.equals(id, other.id);
	}
	
}
