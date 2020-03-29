package com.productfinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.client.DistinctIterable;
import com.productfinder.model.ProductLocation;
import com.productfinder.model.Store;
import com.productfinder.respository.ProductLocationRepository;
import com.productfinder.respository.StoresRepository;

@SpringBootApplication
public class ProductFinderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductFinderApplication.class, args);
	}

	@Autowired
	private ProductLocationRepository productLocationDao;
	@Autowired
	private StoresRepository storeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting .................");
		List<ProductLocation> findByProduct = productLocationDao.findByProduct("TV");
		System.out.println("queried");
		findByProduct.forEach(System.out::println);
		System.out.println("*****STORES**********");
		List<Store> stores = storeRepository.findAll();
		stores.forEach(System.out::println);
		//TODO: Distinct clause not working
		System.out.println("*****DISTINCT STORES**********");
		DistinctIterable<String> distinctStores = productLocationDao.findCustomDistinctStores();
		for (String string : distinctStores) {
			System.out.println(string);
		}
	}

}
