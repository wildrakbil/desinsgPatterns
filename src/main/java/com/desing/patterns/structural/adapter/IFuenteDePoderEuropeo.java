package com.desing.patterns.structural.adapter;
public interface IFuenteDePoderEuropeo {
	// Devuelve un array de enteros con un voltaje de unos 220V
	int[] Flujo220V();
	
	// Devuelve el numero de entradas de la fuente de poder.
	int getNumeroEntradas();
}