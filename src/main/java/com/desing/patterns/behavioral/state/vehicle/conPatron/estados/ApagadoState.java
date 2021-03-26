package com.desing.patterns.behavioral.state.vehicle.conPatron.estados;


import com.desing.patterns.behavioral.state.vehicle.conPatron.contexto.Vehiculo;

public class ApagadoState implements State{

    private Vehiculo vehiculo;

    public ApagadoState(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void acelerar() {
        // Acelerar con el vehiculo apagado no sirve de mucho
        System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
    }

    @Override
    public void frenar() {
        // Frenar con el vehiculo parado tampoco sirve de mucho...
        System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");
    }

    @Override
    public void contacto() {
        // El vehiculo arranca -> Cambio de estado
        //estado = PARADO;
        vehiculo.setEstado(new ParadoState(vehiculo));

        vehiculo.setVelocidadActual(0);
        System.out.println("El vehiculo se encuentra ahora PARADO");
    }
}
