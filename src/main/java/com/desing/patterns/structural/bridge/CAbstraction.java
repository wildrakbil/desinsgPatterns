package com.desing.patterns.structural.bridge;
import java.util.Map;

public class CAbstraction {
	private final IBridge iBridge;

	public CAbstraction ( IBridge _iBridge ) {
		this.iBridge = _iBridge;
	}

	public void showProductsTotal ( Map<String, Float> _products ) {
		iBridge.showProductsTotal( _products );

	}

	public void showProductsList ( Map<String, Float> _products ) {
		iBridge.showProductsList( _products );
	}
}
