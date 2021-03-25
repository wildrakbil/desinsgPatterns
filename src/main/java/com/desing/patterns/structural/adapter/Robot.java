package com.desing.patterns.structural.adapter;
public class Robot {
	// Fuente del robot
	private IFuenteDePoderColombiana fuente;

	// Constructor a traves del cual se inyecta la fuente del robot
	public Robot(IFuenteDePoderColombiana fuenteRobot) {
		this.fuente = fuenteRobot;
	}

	public void Encender() {
		// Obtenemos la alimentaci�n a trav�s de la interfaz.
		// Recordemos que nuestra fuente requiere una alimentacion de 110V
		int[] voltaje100ms = fuente.Flujo110V();

		// Mostramos por pantalla el resultado.
		for (int i = 0; i < voltaje100ms.length; i++)
			System.out.println("El robot esta funcionando con voltaje de " + voltaje100ms[i] + " Voltios");
	}
}