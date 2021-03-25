
package com.desing.patterns.structural.bridge;
import java.util.*;

public class CImplementationC implements IBridge {


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

	@Override
	 public void showProductsList ( Map<String, Float> _products ) {
		System.out.println("\nLa lista de producto es:");

		Map<String, Float> _sortedProducts = new TreeMap<>( _products );

		for ( Map.Entry<String, Float> _actualProduct : _sortedProducts.entrySet()) {
			System.out.println( getColor( _actualProduct.getKey() ) + " - " + _actualProduct.getValue() );
		}
	}

	private float sumByStartingLetter (Map<String, Float> _products, String _letter) {

		return (float) _products.entrySet()
			.stream()
			.filter(e -> e.getKey().startsWith( _letter ))
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
