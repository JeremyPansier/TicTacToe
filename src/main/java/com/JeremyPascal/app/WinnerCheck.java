package com.JeremyPascal.app;

public class WinnerCheck {


	public boolean testWinner(Board board) {
		return verticalTest(board) || horizontalTest(board) || upToLeftDiagonalTest(board) || upToRightDiagonalTest(board);
	}
	
	public boolean horizontalTest(Board board) {
		for (int i = 1; i <= board.getHeight(); i++) {			
			if (horizontalTestOneByOne(board, i)) {
				System.out.println("le joueur " + board.getSpaceAt(i, 1).getPlayer().toChar() + " a gagne horizontalement");
				return true;
			}
		}
		return false;
	}
	
	private boolean horizontalTestOneByOne(Board board, int i) {
		boolean isWon = true;
		Player temporaryPlayer = board.getSpaceAt(i, 1).getPlayer();
		for (int j = 2; j <= board.getWidth(); j++) {
			if (temporaryPlayer == null || temporaryPlayer != board.getSpaceAt(i, j).getPlayer()) {
				isWon = false;
			}
			temporaryPlayer = board.getSpaceAt(i, j).getPlayer();
		}
		return isWon;
	}

	private boolean verticalTest(Board board) {
		for (int j = 1; j <= board.getWidth(); j++) {
			if (verticalTestOneByOne(board, j)) {
				System.out.println("le joueur " + board.getSpaceAt(1, j).getPlayer().toChar() + " a gagne verticalement");
				return true;
			}
		}
		return false;
	}

	private boolean verticalTestOneByOne(Board board, int j) {
		boolean isWon = true;
		Player temporaryPlayer = board.getSpaceAt(1, j).getPlayer();
		for (int i = 2; i <= board.getHeight(); i++) {
			if (temporaryPlayer == null || temporaryPlayer != board.getSpaceAt(i, j).getPlayer()) {
				isWon = false;
			}
			temporaryPlayer = board.getSpaceAt(i, j).getPlayer();
		}	
		return isWon;		
	}

	private boolean upToRightDiagonalTest(Board board) {
		Player temporaryPlayer = board.getSpaceAt(1, 1).getPlayer();
		for (int i = 2; i <= board.getHeight(); i++) {
			for (int j = 2; j <= board.getWidth(); j++)
				if (i == j) {
					if (temporaryPlayer == null || temporaryPlayer != board.getSpaceAt(i, j).getPlayer()) {
						return false;
					}
					temporaryPlayer = board.getSpaceAt(i, j).getPlayer();
				}
		}
		System.out.println("le joueur " + temporaryPlayer.toChar() + " a gagne diagonale du haut vers la droite");
		return true;
	}

	private boolean upToLeftDiagonalTest(Board board) {
		Player temporaryPlayer = board.getSpaceAt(1, board.getWidth()).getPlayer();
		for (int i = 1; i <= board.getWidth(); i++) {
			for (int j = 1; j <= board.getHeight(); j++)
				if (i + j == board.getWidth() + 1) {
					if (temporaryPlayer == null || temporaryPlayer != board.getSpaceAt(i, j).getPlayer()) {
						return false;
					}
					temporaryPlayer = board.getSpaceAt(i, j).getPlayer();
				}
		}
		System.out.println("le joueur " + temporaryPlayer.toChar() + " a gagne diagonale du haut vers la gauche");
		return true;
	}

}
