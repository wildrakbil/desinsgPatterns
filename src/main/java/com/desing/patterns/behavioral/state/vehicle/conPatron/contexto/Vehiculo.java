package com.desing.patterns.behavioral.state.vehicle.conPatron.contexto;


import com.desing.patterns.behavioral.state.vehicle.conPatron.estados.ApagadoState;
import com.desing.patterns.behavioral.state.vehicle.conPatron.estados.State;

public class Vehiculo {

    private State estado;                 // Estado actual del vehiculo (apagado, parado, en marcha)
    private int velocidadActual = 0;      // Velocidad actual del vehiculo

    public Vehiculo() {
        //Indicar un estado inicial (Apagado)
        estado = new ApagadoState(this);
    }

    public void contacto(){
        estado.contacto();
    }
    public void acelerar(){
        estado.acelerar();
        System.out.println("Velocidad actual: " + velocidadActual);
    }
    public void frenar(){
        estado.frenar();
    }

    public void modificarVelocidad(int velocidadKm)
    {
        this.velocidadActual += velocidadKm;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }


}
