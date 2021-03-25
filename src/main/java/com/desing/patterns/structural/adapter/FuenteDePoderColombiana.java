package com.desing.patterns.structural.adapter;
import java.util.Random;

public class FuenteDePoderColombiana implements IFuenteDePoderColombiana {

	// Devuelve un array con voltajes en distintos momentos
	public int[] Flujo110V() {
		int[] arrayFlujo = new int[100];
		Random r = new Random();
		for (int i = 0; i < arrayFlujo.length; i++) {
			// Calculamos la fluctuacion del voltaje
			int fluctuacion = r.nextInt(100) > 50 ? 1 : -1; // Positiva o negativa
			fluctuacion = fluctuacion * (r.nextInt(7) + 1); // El valor fluctuara
															// entre -7 y +7

			// Valor total entre 103 y 117V
			arrayFlujo[i] = fluctuacion + 110;
		}

		return arrayFlujo;
	}

	// Devuelve el numero de entradas de la fuente de poder.
	public int getNumeroEntradas() {
		return 2;
	}
}