package com.desing.patterns.structural.bridge;
import java.util.Map;

public class CImplementationA implements IBridge {

	public void showProductsTotal ( Map<String, Float> products ) {
		float _total = products.values().stream().reduce( (float) 0.0, Float::sum );
		int _quantity = products.size();

		System.out.println("El total de " + _quantity + " productos es " +  _total);
	}

	public void showProductsList ( Map<String, Float> products ) {
		System.out.println("\nLa lista de producto es:");

		for ( String productName : products.keySet()) {
			System.out.println(productName);
		}
	}
}
