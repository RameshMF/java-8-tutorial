package com.ramesh.java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream()
				.filter(product -> product.getPrice() < 30000)
				.map(product -> product.getPrice()).collect(Collectors.toSet()); 
		System.out.println(productPriceList);
	}
}
