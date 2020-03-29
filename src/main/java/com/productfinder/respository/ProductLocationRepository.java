package com.productfinder.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.productfinder.model.ProductLocation;

public interface ProductLocationRepository 
extends MongoRepository<ProductLocation, String>,ProductLocationRepositoryCustom {

  public List<ProductLocation> findByProduct(String product);
}