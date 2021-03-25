package com.desing.patterns.structural.decorator.burgerCombos.decorators;

import com.desing.patterns.structural.decorator.burgerCombos.components.Combo;


/**
 * (Decorator)
 * Clase abstracta de los productos adicionales,
 * cuenta con una descripcion del producto
 *
 *
 */
public abstract class AdicionalesDecorator extends Combo{
	protected Combo combo;

	public AdicionalesDecorator(Combo combo) {
		this.combo = combo;
	}

	public abstract String getDescripcion();
}
