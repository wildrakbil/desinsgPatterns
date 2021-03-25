package com.desing.patterns.structural.decorator.burgerCombos.decorators;

import com.desing.patterns.structural.decorator.burgerCombos.components.Combo;

/**
 * (Decorator Concreto)
 * clase queso, siendo esta un adicional, 
 * cuenta con una descripcion y un precio
 *
 *
 */
public class Queso extends AdicionalesDecorator{

	public Queso(Combo combo) {
		super(combo);
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Queso";
	}

	@Override
	public int valor() {
		return 1000+combo.valor();
	}

}