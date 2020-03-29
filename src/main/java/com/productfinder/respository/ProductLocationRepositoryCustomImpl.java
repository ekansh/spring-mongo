package com.productfinder.respository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.DistinctIterable;

public class ProductLocationRepositoryCustomImpl implements ProductLocationRepositoryCustom {
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public DistinctIterable<String> findCustomDistinctStores() {
		System.out.println("ProductLocationRepositoryCustomImpl.findCustomDistinctStores()");
		DistinctIterable<String> distinct = mongoTemplate.
				getCollection("product_locator").distinct("store",String.class);

		return distinct;
	}

}