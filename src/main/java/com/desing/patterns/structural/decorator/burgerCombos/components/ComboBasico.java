package com.desing.patterns.structural.decorator.burgerCombos.components;

/**
 * Indica un tipo de combo basico, 
 * heredando de la clase padre Combo
 *
 *
 */
public class ComboBasico extends Combo{

	public  ComboBasico() {
		descripcion="Porcion de Papas Fritas, " +
				"salsa, queso, amburgueza sencilla, gaseosa";
	}

	@Override
	public int valor() {
		return 6200;
	}
}
