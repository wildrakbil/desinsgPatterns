package com.desing.patterns.medidorDeSensores;

/**
 * Created by AnDrEy on 3/13/2021.
 */
public class ObservadorVentana implements IObservador {
    // Atributos que modelan el estado
    private double temperatura;
    private double spo2;
    // Subject al que se encuentra suscrito el observer
    private ISujeto sujeto;
    // El constructor suscribira el observer al subject
    public ObservadorVentana(ISujeto sujeto) {
        this.sujeto = sujeto;
        sujeto.RegistrarObservador(this);
    }
    public void update(Object o) {
        // Comprobamos el tipo del objeto recibido como parametro
        double[] arrayDouble = null;
        if (o instanceof double[])
            arrayDouble = (double[]) o;
        // Si es del tipo esperado (double[]) y del tamano esperado (2),
        // actualizamos los atributos
        if ((arrayDouble != null) && (arrayDouble.length == 2)) {
            temperatura = arrayDouble[0];
            spo2 = arrayDouble[1];
            // Mostramos por pantalla los valores actuales
            MostrarValores();
        }
    }
    // Metodo que muestra los valores en el display
    private void MostrarValores() {
        System.out.println("Nivel de Temperatura: " + temperatura);
        System.out.println("Nivel de SPO2: " + spo2);
    }

}
