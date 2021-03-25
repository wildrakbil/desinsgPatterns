package com.desing.patterns.structural.adapter;
public interface IFuenteDePoderColombiana {
	// Devuelve un array de enteros con un voltaje de unos 110V
	int[] Flujo110V();
	
	// Devuelve el numero de entradas de la fuente de poder.
	int getNumeroEntradas();
}