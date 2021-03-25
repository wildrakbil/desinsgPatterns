
package com.desing.patterns.structural.decorator.clothing.components;

/**
 * Class Persona
 */
public class Persona implements IPersona { // concrete component

  public Persona () {
    System.out.println("Nueva persona creada");
  }


  public void llevarRopa()
  {
    System.out.println("Estado base");
    System.out.println("**********");
  }
}
