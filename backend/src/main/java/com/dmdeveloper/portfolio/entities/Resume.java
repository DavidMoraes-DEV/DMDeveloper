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
	@JoinColumn(name = "information_id", referencedColumnName = "id")
	private Information information;
	
	@OneToMany
	@JoinColumn(name = "resume_id")
	private Set<Formation> formations = new HashSet<>();
	
	@OneToMany
	@JoinColumn(name = "resume_id")
	private Set<Course> courses = new HashSet<>();
	
	@OneToMany
	@JoinColumn(name = "resume_id")
	private Set<Technology> technologies = new HashSet<>();
	
	public Resume () {
	}

	public Resume(Long id, String fileUrl, Information information) {
		this.id = id;
		this.fileUrl = fileUrl;
		this.information = information;
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
	
	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public Set<Formation> getFormations() {
		return formations;
	}

	public Set<Course> getCourses() {
		return courses;
	}
	
	public Set<Technology> getTechnologies() {
		return technologies;
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
