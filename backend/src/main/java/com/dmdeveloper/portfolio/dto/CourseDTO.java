package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.dmdeveloper.portfolio.entities.Course;

public class CourseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@Size(min=5 , max=100, message="Deve conter entre 5 e 100 caracteres")
	@NotBlank(message = "Campo Obrigatório")
	private String name;
	
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 5, max = 150, message = "Deve conter entre 5 e 150 caracteres")
	private String institution;
	
	@Positive(message = "Deve ser um valor positivo")
	private Double duration;
	
	@Pattern(regexp = "(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?",
			message = "Deve ser uma URL válida")
	private String certificateUrl;
	private Long resumeId;
	
	public CourseDTO() {
	}

	public CourseDTO (Course entity) {
		id = entity.getId();
		name = entity.getName();
		institution = entity.getInstitution();
		duration = entity.getDuration();
		certificateUrl = entity.getCertificateUrl();
		resumeId = entity.getResume().getId();
	}
	
	public CourseDTO(Long id, String name, String institution, Double duration, String certificateUrl, Long resumeId) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.duration = duration;
		this.certificateUrl = certificateUrl;
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

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getCertificateUrl() {
		return certificateUrl;
	}

	public void setCertificateUrl(String certificateUrl) {
		this.certificateUrl = certificateUrl;
	}

	public Long getResumeId() {
		return resumeId;
	}

	public void setResumeId(Long resumeId) {
		this.resumeId = resumeId;
	}
	
}
