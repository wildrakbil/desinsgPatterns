package com.desing.patterns.structural.decorator.burgerCombos.components;
/**
 * Indica un tipo de combo Familiar,
 * heredando de la clase padre Combo
 *
 *
 */
public class ComboFamiliar extends Combo
{
	
	public ComboFamiliar(){
		descripcion="Doble Porcion de Papas Fritas, " +
				"salsa,doble queso, amburgueza " +
				"Familiar,doble tomate, gaseosa";
	}

	@Override
	public int valor() {
		return 7500;
	}

}
