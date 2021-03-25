package com.desing.patterns.structural.decorator.burgerCombos.decorators;

import com.desing.patterns.structural.decorator.burgerCombos.components.Combo;

/**
 * (Decorator Concreto)
 * clase papas, siendo esta un adicional, cuenta 
 * con una descripcion y un precio
 *
 *
 */
public class Papas extends AdicionalesDecorator{

	public Papas(Combo combo) {
		super(combo);
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Papas";
	}

	@Override
	public int valor() {
		return 1500+combo.valor();
	}

}