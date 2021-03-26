package com.desing.patterns.behavioral.iterpreter;

public class Interprete {

	public static Expresion construirArbolInterprete() {
		
		Expresion terminal_1 = new ExpresionTerminal("Leones");
		Expresion terminal_2 = new ExpresionTerminal("Tigres");

		Expresion no_terminal_1 = new ExpresionAND(terminal_1, terminal_2);

		return no_terminal_1;
	}
}
