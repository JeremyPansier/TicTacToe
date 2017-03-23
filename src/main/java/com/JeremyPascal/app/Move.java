package com.JeremyPascal.app;

public class Move {

	private Space space;
	private Player player;

	public Move(Space space, Player currentPlayer) {
		super();
		this.space = space;
		this.player = currentPlayer;
	}
	public Space getSpace() {
		return space;
	}
	public Player getPlayer() {
		return player;
	}
	
}
