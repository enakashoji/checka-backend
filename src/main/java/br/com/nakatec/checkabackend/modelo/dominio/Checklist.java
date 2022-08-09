package br.com.nakatec.checkabackend.modelo.dominio;

import java.time.OffsetDateTime;

import lombok.Getter;

@Getter
public class Checklist {
	
	private Long id;
    private Driver driver;
    private Truck truck;
    private double previousKm;
    private double currentKm;
    private OffsetDateTime registerDate;
    private boolean broken;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Truck getTruck() {
		return truck;
	}
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	public double getPreviousKm() {
		return previousKm;
	}
	public void setPreviousKm(double previousKm) {
		this.previousKm = previousKm;
	}
	public double getCurrentKm() {
		return currentKm;
	}
	public void setCurrentKm(double currentKm) {
		this.currentKm = currentKm;
	}
	public OffsetDateTime getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(OffsetDateTime registerDate) {
		this.registerDate = registerDate;
	}
	public boolean isBroken() {
		return broken;
	}
	public void setBroken(boolean broken) {
		this.broken = broken;
	}

}
