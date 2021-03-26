package com.desing.patterns.behavioral.iterpreter;

import java.util.StringTokenizer;

public class ExpresionTerminal extends Expresion {

	private String data;

	public ExpresionTerminal(String data) {
		this.data = data;
	}

	public boolean interpretar(String contexto) {
		
		boolean retorno;
		
		StringTokenizer st = new StringTokenizer(contexto);
		while (st.hasMoreTokens()) {
			String test = st.nextToken();
			if (test.equals(data)) {
				retorno = true;
				return retorno;
			}
		}
		retorno = false;
		return retorno;
	}
}