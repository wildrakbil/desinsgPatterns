package com.desing.patterns.structural.bridge;

import java.util.Map;

/**
 * Implementor interface
 */
public interface IBridge {
	void showProductsTotal ( Map<String, Float> _products );
	void showProductsList ( Map<String, Float> _products);
}
