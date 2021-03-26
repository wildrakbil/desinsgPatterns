package com.desing.patterns.behavioral.iterpreter;

public class ExpresionAND extends Expresion {

	private Expresion expr1 = null;
	private Expresion expr2 = null;

	public ExpresionAND(Expresion expr1, Expresion expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpretar(String contexto) {
		
		boolean b_expr1 = expr1.interpretar(contexto);
		boolean b_expr2 = expr2.interpretar(contexto);
		
		return b_expr1 && b_expr2;
	}
}
