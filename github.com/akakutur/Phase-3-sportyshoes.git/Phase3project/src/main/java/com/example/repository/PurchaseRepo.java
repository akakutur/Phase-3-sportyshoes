package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Purchase;

	public interface PurchaseRepo extends CrudRepository<Purchase, Integer> {
		
	}


