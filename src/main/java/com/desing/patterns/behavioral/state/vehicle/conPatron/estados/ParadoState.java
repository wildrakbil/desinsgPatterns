package com.desing.patterns.behavioral.state.vehicle.conPatron.estados;


import com.desing.patterns.behavioral.state.vehicle.conPatron.contexto.Vehiculo;

public class ParadoState implements State{
    private Vehiculo vehiculo;

    public ParadoState(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void acelerar() {
        // El vehiculo se pone en marcha. Aumenta la velocidad y cambiamos de estado
        //estado = EN_MARCHA;
        vehiculo.setEstado(new EnMarchaState(vehiculo));
        System.out.println("El vehiculo se encuentra ahora EN_MARCHA");
        vehiculo.modificarVelocidad(10);
    }

    @Override
    public void frenar() {
        // No ocurre nada. Si el vehiculo ya se encuentra detenido, no habra efecto alguno
        System.out.println("ERROR: El vehiculo ya se encuentra detenido");
    }

    @Override
    public void contacto() {
        // El vehiculo se apaga
        // estado = APAGADO;
        vehiculo.setEstado(new ApagadoState(vehiculo));
        System.out.println("El vehiculo se encuentra ahora APAGADO");
    }
}
