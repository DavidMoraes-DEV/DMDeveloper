package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;

import com.dmdeveloper.portfolio.entities.Resume;

public class ResumeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String fileUrl;
	
	public ResumeDTO () {
	}
	
	public ResumeDTO(Resume entity) {
		id = entity.getId();
		fileUrl = entity.getFileUrl();
	}

	public ResumeDTO(Long id, String fileUrl) {
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
	
}
