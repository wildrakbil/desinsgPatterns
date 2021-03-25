
package com.desing.patterns.structural.decorator.clothing.decorators;

import com.desing.patterns.structural.decorator.clothing.components.IPersona;

/**
 * Class Sueter
 */
public class Sueter extends DecoradorPersona { // concrete decorator

    public Sueter(IPersona persona) {
        super(persona);
    }

    @Override
    public void llevarRopa() {
        super.llevarRopa();
        System.out.println("Usando un Sueter");
    }
}
