package com.desing.patterns.structural.decorator.burgerCombos.decorators;

import com.desing.patterns.structural.decorator.burgerCombos.components.Combo;

/**
 * (Decorator Concreto)
 * clase tomate, siendo esta un adicional, 
 * cuenta con una descripcion y un precio
 *
 *
 */
public class Tomate extends AdicionalesDecorator{

	public Tomate(Combo combo) {
		super(combo);
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Tomate";
	}

	@Override
	public int valor() {
		return 100+combo.valor();
	}

}
