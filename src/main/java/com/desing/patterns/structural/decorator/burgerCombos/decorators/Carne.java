package com.desing.patterns.structural.decorator.burgerCombos.decorators;

import com.desing.patterns.structural.decorator.burgerCombos.components.Combo;


/**
 * (Decorator Concreto)
 * clase Carne, siendo esta un adicional,
 * cuenta con una descripcion y un precio
 *
 *
 */
public class Carne extends AdicionalesDecorator{

	public Carne(Combo combo) {
		super(combo);
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion()+" , Porcion de Carne";
	}

	@Override
	public int valor() {
		return 2500+combo.valor();
	}
}
