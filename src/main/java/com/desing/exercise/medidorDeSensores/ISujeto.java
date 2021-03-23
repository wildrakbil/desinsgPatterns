package com.desing.exercise.medidorDeSensores;

/**
 * Created by AnDrEy on 3/13/2021.
 */
public interface ISujeto {
    void RegistrarObservador(IObservador o);
    void EliminarObservador(IObservador o);
    void NotificarObservadores();
}
