package com.desing.exercise.medidorDeSensores;

/**
 * Created by AnDrEy on 3/13/2021.
 */
public class ObservadorSonido implements IObservador {
    // Niveles minimos y maximos
    private static final double MIN_TEMPERATURA = 36.1;
    private static final double MAX_TEMPERATURA = 37.2;
    private static final double MIN_SPO2 = 96;
    private static final double MAX_SPO2 = 99;
    // Atributos que modelan el estado
    private double temperatura;
    private double spo2;
    // Subject al que se encuentra suscrito el observador
    private ISujeto sujeto;
    // El constructor suscribira el observador al sujeto
    public ObservadorSonido(ISujeto sujeto) {
        this.sujeto = sujeto;
        sujeto.RegistrarObservador(this);
    }
    public void update(Object o) {
        // Comprobamos el tipo del objeto recibido como parametro
        double[] arrayDouble = null;
        if (o instanceof double[])
            arrayDouble = (double[]) o;
        // Si es del tipo esperado (double[]) y del tamano esperado (2), actualizamos los atributos
        if ((arrayDouble != null) && (arrayDouble.length == 2)) {
            temperatura = arrayDouble[0];
            spo2 = arrayDouble[1];
            // Comprobamos que los valores no exceden los limites
            ComprobarTemperatura();
            ComprobarSPO2();
        }
    }
    // Metodo que comprueba los niveles de temperatura
    private void ComprobarTemperatura() {
        if (temperatura < MIN_TEMPERATURA)
            EnviarAlerta("NIVEL DE TEMPERATURA DEMASIADO BAJO: {"+ temperatura +"}/{"+ MIN_TEMPERATURA +"}");
        if (temperatura > MAX_TEMPERATURA)
            EnviarAlerta("NIVEL DE TEMPERATURA DEMASIADO ALTO: {"+ temperatura +"}/{"+ MAX_TEMPERATURA +"}");
    }
    // Metodo que comprueba los niveles de spo2
    private void ComprobarSPO2() {
        if (spo2 < MIN_SPO2)
            EnviarAlerta("NIVEL DE SPO2 DEMASIADO BAJO: {"+ spo2 +"}/{"+ MIN_SPO2 +"}");
        if (spo2 > MAX_SPO2)
            EnviarAlerta("NIVEL DE SPO2 DEMASIADO ALTO: {"+ spo2 +"}/{"+ MAX_SPO2 +"}");
    }
    // Metodo que envie la alerta
    private void EnviarAlerta(String mensaje) {
        // Este metodo podria enviar una alerta a la central de salud.
        System.out.println("ALERTA!! - " + mensaje );
    }

}
