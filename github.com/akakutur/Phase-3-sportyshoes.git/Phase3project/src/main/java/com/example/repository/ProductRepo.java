package com.example.repository;

//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Product;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Integer>{

	List<Product> findByseason(String season);

	List<Product> findBybrand(String brand);

	List<Product> findBycolor(String color);

	List<Product> findBycategory(String category);

	List<Product> findByprice(int price);

	List<Product> findBycreatedDate(String createdDate);

	
	

	
}
