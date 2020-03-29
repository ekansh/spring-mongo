package com.productfinder.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection="product_location")
public class ProductLocation {
	private @Id String id;
	private String store;
	private String address;
	private String location;
	private String product;
	private String aisle;
	private Integer storeId;
	@Override
	public String toString() {
		return String.format(
				"Product Location[id=%s, store='%s'," + " address='%s',"
						+ "product='%s', product='%s', aisle='%s', storeId='%d']",
				id, store, address,location, product, aisle,storeId);
	}
}
