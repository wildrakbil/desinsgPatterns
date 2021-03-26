package com.desing.patterns.behavioral.mediator;
import javax.swing.*;
import java.awt.event.ActionListener;

//Un amigo concreto
public class BtnSearch extends JButton implements ICommand {

	IMediator mediator;

	BtnSearch ( ActionListener actionListener, IMediator mediator ) {
		super( "Search" );
		addActionListener( actionListener );
		this.mediator = mediator;
		this.mediator.registerSearch( this );
	}

	public void execute () {
		mediator.search();
	}

}