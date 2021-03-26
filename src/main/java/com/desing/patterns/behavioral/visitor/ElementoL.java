package com.desing.patterns.behavioral.visitor;

/**
 * Created by AnDrEy on 3/26/2021.
 */
public class ElementoL extends Elemento {

    public ElementoL(Elemento pHijo, Elemento pSiguiente) {
        super();
        siguiente = pSiguiente;
        hijo = pHijo;
    }

    public void aceptar(IVisitante pVisitante) {
        //Nos mandamos como parametro para que el visitante procese lo necesario
        pVisitante.Visitar(this);
    }
}
