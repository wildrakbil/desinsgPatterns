package com.desing.exercise.agregacion;

/**
 * Created by AnDrEy on 4/9/2021.
 */
public class Car {
    public Estereo _estereo;
    public Motor _motor;
    public Car(){}
    public void ensamblar (Estereo estereo, Motor motor){
        _estereo = estereo;
        _motor = motor;
    }
}
