package com.desing.patterns.behavioral.iterpreter;

public abstract class Expresion {
	public abstract boolean interpretar(String context);
	
	public void procesar(Contexto contexto) {
		
		String input = contexto.toString();
		
		Boolean output = this.interpretar(input);
		
		contexto.setOutput( input + " es " + output);
	};
}
