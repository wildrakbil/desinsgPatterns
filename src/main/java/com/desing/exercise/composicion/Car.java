package com.desing.exercise.composicion;

/**
 * Created by AnDrEy on 4/9/2021.
 */
public class Car {
    public Estereo _estereo;
    public Motor _motor;
    public Car(){
        _estereo = new Estereo();
        _motor = new Motor();
    }

}
