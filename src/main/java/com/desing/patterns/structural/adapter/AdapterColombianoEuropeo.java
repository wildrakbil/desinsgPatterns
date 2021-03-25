package com.desing.patterns.structural.adapter;

public class AdapterColombianoEuropeo implements IFuenteDePoderColombiana {
	// Declaramos una referencia de la clase o interfaz a la que queremos conectarnos
	private IFuenteDePoderEuropeo fuente;

	// El constructor del adaptador recibir� como par�metro el objeto al que se quiere adaptar nuestro cliente.
	public AdapterColombianoEuropeo(IFuenteDePoderEuropeo fuente) {
		this.fuente = fuente;
	}

	// Invocamos los m�todos de la interfaz servidora, transformando los datos para que pueda manejarlos la clase cliente.
	public int[] Flujo110V() {
		// Invocamos el m�todo de la interfaz incompatible
		int[] voltajes220 = fuente.Flujo220V();

		// Realizamos la adaptacion
		int[] voltajes110 = new int[voltajes220.length];

		for (int i = 0; i < voltajes220.length; i++)
			voltajes110[i] = (int) (voltajes220[i] / 2);
		// Devolvemos el resultado adaptado, que es el que espera el cliente
		return voltajes110;
	}

	public int getNumeroEntradas() {
		return fuente.getNumeroEntradas() - 1;
	}
}