package com.laptop.services;

import java.util.List;

import com.laptop.model.Laptop;

public interface ILaptopService {
 List<Laptop> getAll();
 List<Laptop> getByModel(String model);
 List<Laptop> getByBrand(String brand);
 Laptop getById(int laptopId);
Laptop getByPrice(double price);
}
