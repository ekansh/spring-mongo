package com.productfinder.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.productfinder.model.Store;

public interface StoreRepository extends MongoRepository<Store, String> {
	public List<Store> findAll();
}