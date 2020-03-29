package com.productfinder.respository;

import com.mongodb.client.DistinctIterable;

public interface ProductLocationRepositoryCustom {

	public DistinctIterable<String> findCustomDistinctStores();

}