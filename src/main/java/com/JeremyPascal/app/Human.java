package com.JeremyPascal.app;

public class Human extends PlayerBase {

	public Human(char item) {
		super(item);
	}

	public Space play(Board board){
		int x;
		int y;
		InputValidation inputValidation= new InputValidation();
		do {
			x = XYReader.readUserInput('x', this);
			y = XYReader.readUserInput('y', this);
		} while (!inputValidation.validateInput(board,x, y));

		Space space = board.getSpaceAt(x, y); // low coupling
		space.setPlayer(this);
		return space;
	}

}
