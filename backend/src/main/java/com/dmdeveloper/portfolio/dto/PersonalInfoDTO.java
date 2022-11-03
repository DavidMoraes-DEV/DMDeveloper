package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.dmdeveloper.portfolio.entities.PersonalInfo;

public class PersonalInfoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "Campo Obrigatório")
	private String name;
	private Instant birthDate;
	private String genre;

	@NotBlank(message = "Campo Obrigatório")
	private String phone;

	@NotBlank(message = "Campo Obrigatório")
	@Email(regexp = "^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{2,3}$", message = "Apenas email válido: example@email.com")
	private String email;

	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 5, max = 100, message = "Deve conter entre 5 e 60 caracteres")
	private String address;

	@Pattern(regexp = "^\\d{5}-\\d{3}$|^\\d{8}$", message = "Apenas CEP brasileiro exemplo: 12345-678 ou 12345678")
	private String cep;
	
	@NotBlank(message = "Campo Obrigatório")
	private String city;
	
	@Size(min = 2, max = 2, message = "Informar apenas as siglas do Estado: PR, SP, SC...")
	private String state;
	
	@Size(min = 1, max = 5, message = "Informar apenas a categoria: A, AB...")
	private String cnh;
	private Long resumeId;

	public PersonalInfoDTO() {
	}

	public PersonalInfoDTO(PersonalInfo entity) {
		id = entity.getId();
		name = entity.getName();
		birthDate = entity.getBirthDate();
		genre = entity.getGenre();
		phone = entity.getPhone();
		email = entity.getEmail();
		address = entity.getAddress();
		cep = entity.getCep();
		city = entity.getCity();
		state = entity.getState();
		cnh = entity.getCnh();
		resumeId = entity.getResume().getId();
	}

	public PersonalInfoDTO(Long id, String name, Instant birthDate, String genre, String phone, String email,
			String address, String cep, String city, String state, String cnh, Long resumeId) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.genre = genre;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.cep = cep;
		this.city = city;
		this.state = state;
		this.cnh = cnh;
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

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Long getResumeId() {
		return resumeId;
	}

	public void setResumeId(Long resumeId) {
		this.resumeId = resumeId;
	}

}
