package com.desing.patterns.behavioral.visitor;

/**
 * Created by AnDrEy on 3/26/2021.
 */
public class Elemento implements IElemento{

    public Elemento siguiente;
    public Elemento hijo;

    private double costo;
    private String nombre;

    public Elemento() {
        System.out.println("Elemento Creado");
    }

    public Elemento(double pCosto, String pNombre, Elemento pSiguiente) {

        System.out.println(String.format("Elemento creado con siguiente {%s}-> ${%s}", pNombre, pCosto));
        siguiente = pSiguiente;
        costo = pCosto;
        nombre = pNombre;
    }

    //Aceptamos al visitante
    public void aceptar(IVisitante pVisitante) {
        //Nos mandamos como parametro para que el visitante procese lo necesario
        pVisitante.Visitar(this);
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
