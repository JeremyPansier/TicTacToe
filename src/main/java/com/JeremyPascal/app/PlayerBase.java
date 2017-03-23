package com.JeremyPascal.app;

public abstract class PlayerBase implements Player{

	private char item;

	public PlayerBase(char item) {
		super();
		this.item = item;
	}

	public char toChar() {
		return item;
	}

}
