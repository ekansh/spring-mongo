package com.productfinder.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.productfinder.model.Store;

public interface StoresRepository extends MongoRepository<Store, String> {
}