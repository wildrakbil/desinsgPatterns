package com.desing.patterns.prototype.game.sinUsarClonable;

public class Hechicero extends Enemigo{

    public Hechicero() {
        System.out.println("Hechicero creado");
    }

    @Override
    public Enemigo clonar() {
        /*
         * Creamos una nueva instancia y le asignamos los valores actuales para
         * después devolverlo (es también de tipo 'Prototype' ya que hereda de él)
         */
        Hechicero objHechicero = new Hechicero();

        objHechicero.setNombre( this.getNombre() );
        objHechicero.setArma( this.getArma() );

        return objHechicero;
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
