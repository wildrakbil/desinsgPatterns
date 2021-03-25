package com.desing.patterns.structural.decorator.clothing.decorators;

import com.desing.patterns.structural.decorator.clothing.components.IPersona;


/**
 * Class Impermeable
 */
public class Impermeable extends DecoradorPersona { // concrete decorator

    public Impermeable(IPersona persona) {
        super(persona);
    }

    @Override
    public void llevarRopa() {
        super.llevarRopa();
        System.out.println("Usando un Impermeable");
    }
}
