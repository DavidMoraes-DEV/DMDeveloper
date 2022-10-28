package com.dmdeveloper.portfolio.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_resume")
public class Resume implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fileUrl;

	
	@OneToMany(mappedBy = "resume")
	private Set<PersonalInfo> personalInfos = new HashSet<>();
	
	@OneToMany(mappedBy = "resume")
	private Set<Formation> formations = new HashSet<>();
	
	@OneToMany(mappedBy = "resume")
	private Set<Course> courses = new HashSet<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private Set<Skill> skills = new HashSet<>();
	
	public Resume () {
	}

	public Resume(Long id, String fileUrl) {
		this.id = id;
		this.fileUrl = fileUrl;
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

	public Set<PersonalInfo> getPersonalInfos() {
		return personalInfos;
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
