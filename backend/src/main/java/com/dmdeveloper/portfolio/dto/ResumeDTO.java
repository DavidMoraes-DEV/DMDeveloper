package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.entities.Information;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.entities.Technology;

public class ResumeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fileUrl;
	private InformationDTO information;
	
	private Set<FormationDTO> formations = new HashSet<>();
	
	private Set<CourseDTO> courses = new HashSet<>();
	
	private Set<TechnologyDTO> technologies = new HashSet<>();
	
	public ResumeDTO () {
	}

	public ResumeDTO(Long id, String fileUrl, Information information) {
		this.id = id;
		this.fileUrl = fileUrl;
		this.information = new InformationDTO(information);
	}
	
	public ResumeDTO(Resume entity) {
		id = entity.getId();
		fileUrl = entity.getFileUrl();
		information = new InformationDTO(entity.getInformation());
	}

	public ResumeDTO(Resume entity, Set<Formation> formations, Set<Course> courses, Set<Technology> technologies) {
		this(entity);
		formations.forEach(formation -> this.formations.add(new FormationDTO(formation)));
		courses.forEach(course -> this.courses.add(new CourseDTO(course)));
		technologies.forEach(tec -> this.technologies.add(new TechnologyDTO(tec, tec.getCategories())));
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

	public InformationDTO getInformation() {
		return information;
	}

	public void setInformationDTO(InformationDTO information) {
		this.information = information;
	}

	public Set<FormationDTO> getFormations() {
		return formations;
	}

	public Set<CourseDTO> getCourses() {
		return courses;
	}
	
	public Set<TechnologyDTO> getTechonologies() {
		return technologies;
	}
	
}
