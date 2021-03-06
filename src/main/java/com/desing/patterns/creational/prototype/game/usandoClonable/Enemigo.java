package com.desing.patterns.creational.prototype.game.usandoClonable;

/**
 * Prototipo
 */
public abstract class Enemigo implements Cloneable
{
    private String nombre ="";
    private String arma = "DAGA";

    public Enemigo clonar() throws CloneNotSupportedException {
        // Es necesario hacer el typecast porque 'clone()' devuelve 'Object'
        return (Enemigo) this.clone();
    }


    // Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract void atacar();
    public abstract void detener();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
