package com.desing.patterns.structural.decorator.clothing.decorators;


import com.desing.patterns.structural.decorator.clothing.components.IPersona;

/**
 * Class DecoradorPersona
 */
public class DecoradorPersona implements IPersona { // decorator

  protected IPersona persona;

  public DecoradorPersona(IPersona persona) {
    this.persona = persona;
  }


  public void llevarRopa() {
    this.persona.llevarRopa();
  }

}
