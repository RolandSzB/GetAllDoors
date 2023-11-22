package com.example;

import java.sql.Date;

public class Doors {

	private int id;
	private String material;
	private double height;
	private double width;
	private Date installationDate;
	
	
	
	public Doors(int id, String material, double height, double width, Date installationDate) {
	
		this.id = id;
		this.material = material;
		this.height = height;
		this.width = width;
		this.installationDate = installationDate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public Date getInstallationDate() {
		return installationDate;
	}
	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}
	
	
	
}
