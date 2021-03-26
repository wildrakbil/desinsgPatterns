package com.desing.patterns.behavioral.mediator;
import javax.swing.*;
import java.awt.event.ActionListener;

//Un amigo concreto
public class BtnBook extends JButton implements ICommand {

	IMediator mediator;

	BtnBook ( ActionListener actionListener, IMediator mediator ) {
		super( "Book" );
		addActionListener( actionListener );
		this.mediator = mediator;
		this.mediator.registerBook( this );
	}

	public void execute (){
			mediator.book();
	}

}