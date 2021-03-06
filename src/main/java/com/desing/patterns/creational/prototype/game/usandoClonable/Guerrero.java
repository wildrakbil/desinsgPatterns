package com.desing.patterns.creational.prototype.game.usandoClonable;

/**
 * PrototipoConcreto1
 */
public class Guerrero extends Enemigo
{
    public Guerrero() {
        System.out.println("Guerrero creado");
    }

    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }

    @Override
    public void detener() {
        System.out.println("El guerrero se detiene");
    }
}
