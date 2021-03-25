package com.desing.patterns.creational.prototype.game.usandoClonable;

    public class Hechicero extends Enemigo {

    public Hechicero() {
        System.out.println("Hechicero creado");
    }

    @Override
    public void atacar() {
        System.out.println("El hechicero ataca");
    }

    @Override
    public void detener() {
        System.out.println("El hechiero se detiene");
    }
}
