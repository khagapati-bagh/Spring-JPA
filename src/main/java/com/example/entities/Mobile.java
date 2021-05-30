package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	
	@Id
	private String id;
	private String brand;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + "]";
	}
	
	
}
