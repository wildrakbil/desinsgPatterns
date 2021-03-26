package com.desing.patterns.behavioral.mediator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediatorDemo extends JFrame implements ActionListener {

	IMediator mediator = new Mediator();

	public MediatorDemo () {
		JPanel p = new JPanel();
		p.add( new BtnView( this, mediator ) );
		p.add( new BtnBook( this, mediator ) );
		p.add( new BtnSearch( this, mediator ) );
		getContentPane().add( new LblDisplay( mediator ), "North" );
		getContentPane().add( p, "South" );
		setSize( 400, 200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setVisible( true );
	}

	@Override public void actionPerformed ( ActionEvent actionEvent ) {
		ICommand iCommand = (ICommand) actionEvent.getSource();
		iCommand.execute();
	}

}