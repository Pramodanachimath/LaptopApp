package com.laptop.services;

import java.util.ArrayList;
import java.util.List;

import com.laptop.model.Laptop;

public class LaptopServiceImpl implements ILaptopService {

	@Override
	public List<Laptop> getAll() {
		return showAll();
	}

	@Override
	public List<Laptop> getByModel(String model) {
		List<Laptop> laptopList=showAll();
		List<Laptop> laptopByModel=new ArrayList<>();
		for (Laptop laptop : laptopList) {
			if(laptop.getModel().equals(model)) {
				laptopByModel.add(laptop);
			}
		}
		return laptopByModel;
	}

	@Override
	public List<Laptop> getByBrand(String brand) {
		List<Laptop> laptopList=showAll();
		List<Laptop> laptopByBrand=new ArrayList<>();
		for (Laptop laptop : laptopList) {
			if(laptop.getBrand().equals(brand)) {
				laptopByBrand.add(laptop);
			}
		}
		return laptopByBrand;
	}

	@Override
	public Laptop getById(int laptopId) {
		List<Laptop> laptopList=showAll();
		for (Laptop laptop : laptopList) {
			if(laptop.getLaptopId()==laptopId) {
				return laptop;
			}
		}
		return null;
	}

	@Override
	public Laptop getByPrice(double price) {
		List<Laptop> laptopList=showAll();
		for (Laptop laptop : laptopList) {
			if(laptop.getPrice()==price) {
				return laptop;
			}
		}
		return null;
	}

	private List<Laptop> showAll(){
		List<Laptop> laptopList=new ArrayList<>();

		laptopList.add(new Laptop("Z580", "Lenovo", 301, 20000));
		laptopList.add(new Laptop("Z580", "Apple", 302, 30000));
		laptopList.add(new Laptop("Z580", "Dell", 304, 50000));
		laptopList.add(new Laptop("Z580", "Lenovo", 303, 40000));
		laptopList.add(new Laptop("Z580", "Apple", 302, 60000));
		laptopList.add(new Laptop("Z580", "Dell", 304, 30000));
		
		return laptopList;
		
	}
}
