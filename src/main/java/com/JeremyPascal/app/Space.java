package com.JeremyPascal.app;

public class Space {

	private int x;
	private int y;
	private Player player;

	public Space(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Space(int x, int y, Player player) {
		this(x, y);
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public char getItem() {
		char retour = ' ';
		if (player != null) {
			retour = player.toChar();
		}
		return retour;
	}

}
