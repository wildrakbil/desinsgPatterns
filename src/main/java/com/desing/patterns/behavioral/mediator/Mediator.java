package com.desing.patterns.behavioral.mediator;
//Mediador Concreto
public class Mediator implements IMediator {

	BtnView    btnView;
	BtnSearch  btnSearch;
	BtnBook    btnBook;
	LblDisplay lblDisplay;

	//....
	public void registerView ( BtnView btnView ) {
		this.btnView = btnView;
	}

	public void registerSearch ( BtnSearch btnSearch ) {
		this.btnSearch = btnSearch;
	}

	public void registerBook ( BtnBook btnBook ) {
		this.btnBook = btnBook;
	}

	public void registerDisplay ( LblDisplay lblDisplay ) {
		this.lblDisplay = lblDisplay;
	}

	public void book () {
		btnBook.setEnabled( false );
		btnView.setEnabled( true );
		btnSearch.setEnabled( true );
		lblDisplay.setText( "booking..." );
	}

	public void view () {
		btnView.setEnabled( false );
		btnSearch.setEnabled( true );
		btnBook.setEnabled( true );
		lblDisplay.setText( "viewing..." );
	}

	public void search () {
		btnSearch.setEnabled( false );
		btnView.setEnabled( true );
		btnBook.setEnabled( true );
		lblDisplay.setText( "searching..." );
	}

}