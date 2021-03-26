package com.desing.patterns.behavioral.state.vehicle.conPatron.estados;


import com.desing.patterns.behavioral.state.vehicle.conPatron.contexto.Vehiculo;

public class EnMarchaState implements State {

    private Vehiculo vehiculo;
    private final int VELOCIDAD_MAXIMA = 200;

    public EnMarchaState(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void acelerar() {
        // Aumentamos la velocidad, permaneciendo en el mismo estado
        if (vehiculo.getVelocidadActual() >= VELOCIDAD_MAXIMA)
            System.out.println("ERROR: El vehiculo ha alcanzado su velocidad maxima");
        else
            vehiculo.modificarVelocidad(10);
    }

    @Override
    public void frenar() {
        // Reducimos la velocidad. Si esta llega a 0, cambiaremos a estado "PARADO"
        vehiculo.modificarVelocidad(-10);
        if (vehiculo.getVelocidadActual() <= 0)
        {
            //estado = PARADO;
            vehiculo.setEstado(new ParadoState(vehiculo));
            System.out.println("El vehiculo se encuentra ahora PARADO");
        }
        System.out.println("Velocidad actual: " + vehiculo.getVelocidadActual());
    }

    @Override
    public void contacto() {
        // No se puede detener el vehiculo en marcha!
        System.out.println("ERROR: No se puede cortar el contacto en marcha!");
    }
}
