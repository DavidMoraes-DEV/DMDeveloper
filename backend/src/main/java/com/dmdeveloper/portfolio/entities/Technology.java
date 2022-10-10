package com.dmdeveloper.portfolio.entities;

import java.util.Objects;

public class Technology {
	
	private Long id;
	private String name;
	private String imgIcon;
	
	public Technology () {
	}

	public Technology(Long id, String name, String imgIcon) {
		this.id = id;
		this.name = name;
		this.imgIcon = imgIcon;
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

	public String getImgIcon() {
		return imgIcon;
	}

	public void setImgIcon(String imgIcon) {
		this.imgIcon = imgIcon;
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
		Technology other = (Technology) obj;
		return Objects.equals(id, other.id);
	}
	
}
