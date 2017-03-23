package com.JeremyPascal.app;

public class Board {

	private int width;
	private int height;
	private Space[][] spaces;

	public Board(int width, int height) {
		super();
		this.width = width;
		this.height = height;

		spaces = new Space[width][height];
		for (int x = 0; x < spaces.length; x++) {
			for (int y = 0; y < spaces[x].length; y++) {
				spaces[x][y] = new Space(x, y, null);
			}
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Space getSpaceAt(int x, int y) {
		return spaces[x - 1][y - 1];
	}
	
}
