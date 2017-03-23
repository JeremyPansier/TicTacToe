package com.JeremyPascal.app;

import java.util.Random;

public class Bot extends PlayerBase {

	public Bot(char item) {
		super(item);
	}

	public Space play(Board board) {
		Random r = new Random();
		int valeurMaxX = board.getWidth()+1;
		int valeurMaxY = board.getHeight()+1;
		int  x;
		int  y;
		InputValidation inputValidation = new InputValidation();

		do {
			x = 1 + r.nextInt(valeurMaxX - 1);
			y = 1 + r.nextInt(valeurMaxY - 1);
		} while (!inputValidation.validateInputBot(board,x, y));

		Space space = board.getSpaceAt(x, y); // low coupling
		space.setPlayer(this);
		return space;
	}

}
