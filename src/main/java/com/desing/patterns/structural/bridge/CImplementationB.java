package com.desing.patterns.structural.bridge;
import java.util.Map;

public class CImplementationB implements IBridge {

	public void showProductsTotal ( Map<String, Float> products ) {

		float _total = products.values().stream().reduce( (float) 0.0, Float::sum );
		int _quantity = products.size();

		float _totalA = sumByStartingLetter( products, "A" );
		float _totalB = sumByStartingLetter( products, "B" );
		float _totalC = sumByStartingLetter( products, "C" );

		System.out.println("El total de productos A es " + _totalA);
		System.out.println("El total de productos B es " + _totalB);
		System.out.println("El total de productos C es " + _totalC);

		System.out.println("El total de " + _quantity + " productos es " +  _total);
	}

	public void showProductsList ( Map<String, Float> products ) {
		System.out.println("\nLa lista de producto es:");

		for ( Map.Entry<String, Float> actualProduct : products.entrySet()) {
			System.out.println( getColor( actualProduct.getKey() ) + " - " + actualProduct.getValue() );
		}
	}

	private float sumByStartingLetter (Map<String, Float> products, String letter) {

		return (float) products.entrySet()
			.stream()
			.filter(e -> e.getKey().startsWith( letter ))
			.mapToDouble(Map.Entry::getValue)
			.sum();
	}

	private String getColor(String _productName) {

		switch ( _productName.substring( 0, 1 ) ) {
			case "A":
				return "\u001B[32m" + _productName; // green
			case "B":
				return "\u001B[33m" + _productName; // yellow
			case "C":
				return "\u001B[31m" + _productName; // red
			default:
				return "\u001B[0m" + _productName; // reset
		}
	}

}
