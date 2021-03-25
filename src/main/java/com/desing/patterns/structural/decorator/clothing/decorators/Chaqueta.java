package com.desing.patterns.structural.decorator.clothing.decorators;

import com.desing.patterns.structural.decorator.clothing.components.IPersona;

/**
 * Class Chaqueta
 */
public class Chaqueta extends DecoradorPersona { // concrete decorator

  public Chaqueta(IPersona persona) {
    super(persona);
  }

  @Override
  public void llevarRopa() {
    super.llevarRopa();
    System.out.println("Usando una chaqueta");
  }
}
