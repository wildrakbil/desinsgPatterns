package com.desing.patterns.behavioral.mediator;
//Mediador Abstracto
public interface IMediator {
	void book ();

	void view ();

	void search ();

	void registerView ( BtnView btnView );

	void registerSearch ( BtnSearch btnSearch );

	void registerBook ( BtnBook btnBook );

	void registerDisplay ( LblDisplay lblDisplay );
}