package com.desing.patterns.behavioral.visitor;

/**
 * Created by AnDrEy on 3/26/2021.
 */
public class Visitante implements IVisitante{

    private int conteo;
    private int clasificaciones;
    private double total;

    public void ContarElementos(Elemento pElemento)
    {
        //Nos mandamos como visitante al elemento
        pElemento.aceptar(this);

        //Vemos si tenemos hijo
        if (pElemento.hijo != null)
            ContarElementos(pElemento.hijo);

        //Vemos si tenemos siguiente
        if (pElemento.siguiente != null)
            ContarElementos(pElemento.siguiente);
    }

    @Override
    public void Visitar(Elemento pElemento) {
        conteo++;
        total += pElemento.getCosto();

    }

    @Override
    public void Visitar(ElementoL pElemento) {
        clasificaciones++;
        System.out.println("No Conteo");
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    public int getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(int clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
