package com.laptop.client;

import com.laptop.services.ILaptopService;
import com.laptop.services.LaptopServiceImpl;

public class LaptopMain {

	public static void main(String[] args) {

		ILaptopService laptopService=new LaptopServiceImpl();
		
		System.out.println(laptopService.getAll());
		System.out.println();
		System.out.println(laptopService.getByBrand("Lenovo"));
		System.out.println();
		System.out.println(laptopService.getByModel("Z580"));
		System.out.println();
		System.out.println(laptopService.getById(301));
		System.out.println();
		System.out.println(laptopService.getByPrice(40000));
	}

}
