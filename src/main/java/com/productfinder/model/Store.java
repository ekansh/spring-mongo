package com.productfinder.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "stores")
public class Store {
	private @Id String id;
	private String store;
	private String address;
	private String location;
	private Integer storeId;

	@Override
	public String toString() {
		return String.format("Stores [id=%s, store='%s',"
				+ " address='%s', location='%s', storeId='%n'",
				id, store,address,location,storeId);
	}
}
