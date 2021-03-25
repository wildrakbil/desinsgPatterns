package com.desing.patterns.structural.decorator.burgerCombos.components;

/**
 * Clase combo, esta clase indica la clase 
 * padre del tipo de combo disponible, cuenta con una 
 * descripcion y un precio
 *
 *
 */
public abstract class Combo {
	
	protected String descripcion = "";
	
	public String getDescripcion() 
	{
		return descripcion;
	}

	public abstract int valor();

}
