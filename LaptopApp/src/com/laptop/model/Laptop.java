package com.laptop.model;

public class Laptop {
 private String model;
 private String brand;
 private int laptopId;
 private double price;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(String model, String brand, int laptopId, double price) {
	super();
	this.model = model;
	this.brand = brand;
	this.laptopId = laptopId;
	this.price = price;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getLaptopId() {
	return laptopId;
}
public void setLaptopId(int laptopId) {
	this.laptopId = laptopId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [model=" + model + ", brand=" + brand + ", laptopId=" + laptopId + ", price=" + price + "]";
}
 
}
