package com.desing.patterns.behavioral.mediator;
import javax.swing.*;
import java.awt.*;

class LblDisplay extends JLabel {

	IMediator mediator;

	LblDisplay ( IMediator mediator ) {
		super( "Just start..." );
		this.mediator = mediator;
		this.mediator.registerDisplay( this );
		setFont( new Font( "Arial", Font.BOLD, 24 ) );
	}

}