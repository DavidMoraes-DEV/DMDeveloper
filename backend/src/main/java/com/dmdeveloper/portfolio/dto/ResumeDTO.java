package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.entities.Skill;

public class ResumeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fileUrl;
	private PersonalInfoDTO personalInfo;
	
	private Set<FormationDTO> formations = new HashSet<>();
	
	private Set<CourseDTO> courses = new HashSet<>();
	
	private Set<SkillDTO> skills = new HashSet<>();
	
	public ResumeDTO () {
	}

	public ResumeDTO(Long id, String fileUrl) {
		this.id = id;
		this.fileUrl = fileUrl;
	}
	
	public ResumeDTO(Resume entity) {
		id = entity.getId();
		fileUrl = entity.getFileUrl();
	}

	public ResumeDTO(Resume entity, Set<Formation> formations, Set<Course> courses, Set<Skill> skills) {
		this(entity);
		formations.forEach(formation -> this.formations.add(new FormationDTO(formation)));
		courses.forEach(course -> this.courses.add(new CourseDTO(course)));
		skills.forEach(tec -> this.skills.add(new SkillDTO(tec, tec.getCategories())));
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

	public PersonalInfoDTO getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfoDTO(PersonalInfoDTO personalInfo) {
		this.personalInfo = personalInfo;
	}

	public Set<FormationDTO> getFormations() {
		return formations;
	}

	public Set<CourseDTO> getCourses() {
		return courses;
	}
	
	public Set<SkillDTO> getSkills() {
		return skills;
	}
	
}
