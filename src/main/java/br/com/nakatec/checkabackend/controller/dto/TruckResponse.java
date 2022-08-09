package br.com.nakatec.checkabackend.controller.dto;

import lombok.Data;

public @Data
class TruckResponse {
    private Long id;
    private String license;
    private String brand;
    private String model;
    private String sinceYear;
    private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSinceYear() {
		return sinceYear;
	}
	public void setSinceYear(String sinceYear) {
		this.sinceYear = sinceYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
