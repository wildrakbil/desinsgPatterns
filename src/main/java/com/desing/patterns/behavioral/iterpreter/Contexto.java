package com.desing.patterns.behavioral.iterpreter;

public class Contexto {

	
	private String input;
	private String output;
	
	public Contexto(String input) {
		super();
		this.input = input;
	}

	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}

	@Override
	public String toString() {
		return input;
	}
}
