package com.desing.patterns.creational.prototype.game.sinUsarClonable;

import java.util.Hashtable;

/**
 * Cliente
 */
public class GestorEnemigo {

    // Para almacenar los objetos de tipo Prototype que se vayan creando
    private Hashtable hEnemigos = new Hashtable();

    public GestorEnemigo() {

        // Crear un Hechicero y asignarle propiedades
        Enemigo h1 = new Hechicero();
        h1.setNombre("Sorcerer1");

        // Guardarlo
        this.addEnemigo( h1.getNombre(), h1 );

        // Crear un Guerrero y asignarle propiedades
        Enemigo g1 = new Guerrero();
        g1.setNombre("Warrior1");
        g1.setArma("ESPADA");

        // Guardarlo
        this.addEnemigo( g1.getNombre(), g1 );
    }
    public void addEnemigo( String nombre, Enemigo objEnemigo )
    {
        this.hEnemigos.put( nombre, objEnemigo );
    }

    public Enemigo getEnemigo( String nombre )
    {
        Enemigo objPrototipo = (Guerrero) hEnemigos.get( nombre );
        return objPrototipo;
    }

    public Enemigo getClon( String nombre )
    {
        // Localizar el objeto deseado
        Enemigo objPrototipo = (Guerrero) hEnemigos.get( nombre );
        // Devolver un clon
        return (Enemigo) objPrototipo.clonar();
    }

}
