package com.desing.patterns.behavioral.mediator;
import javax.swing.*;
import java.awt.event.ActionListener;

//Un amigo concreto
public class BtnView extends JButton implements ICommand {

	IMediator mediator;

	BtnView ( ActionListener actionListener, IMediator mediator ) {
		super( "View" );
		addActionListener( actionListener );
		this.mediator = mediator;
		this.mediator.registerView( this );
	}

	public void execute () {
		mediator.view();
	}

}