package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.entities.PersonalInfo;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.entities.Skill;

public class ResumeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "Campo Obrigatório")
	@Pattern(regexp = "(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?",
			message = "Deve ser uma URL válida")
	private String fileUrl;

	private Set<PersonalInfoDTO> personalInfos = new HashSet<>();

	private Set<FormationDTO> formations = new HashSet<>();

	private Set<CourseDTO> courses = new HashSet<>();

	private Set<SkillDTO> skills = new HashSet<>();

	public ResumeDTO() {
	}

	public ResumeDTO(Long id, String fileUrl) {
		this.id = id;
		this.fileUrl = fileUrl;
	}

	public ResumeDTO(Resume entity) {
		id = entity.getId();
		fileUrl = entity.getFileUrl();
	}

	public ResumeDTO(Resume entity, Set<PersonalInfo> personalInfos, Set<Formation> formations, Set<Course> courses,
			Set<Skill> skills) {
		this(entity);
		personalInfos.forEach(personalInfo -> this.personalInfos.add(new PersonalInfoDTO(personalInfo)));
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

	public Set<PersonalInfoDTO> getPersonalInfos() {
		return personalInfos;
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
