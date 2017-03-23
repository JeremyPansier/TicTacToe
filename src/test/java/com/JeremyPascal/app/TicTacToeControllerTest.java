package com.JeremyPascal.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeControllerTest {



	@Test
	public void shouldDetectVictoryOnHorizontalLine() {
		//GIVEN
		//construire board gagnant pour un joueur sur ligne horizontale
		BoardDisplay displayBoard = new BoardDisplay();
		Board board=new Board(3, 3);
		Player player1 = new Bot('X');
		Player player2 = new Bot('O');
		board.getSpaceAt(1, 1).setPlayer(player1);
		board.getSpaceAt(2, 1).setPlayer(player2);
		board.getSpaceAt(1, 2).setPlayer(player1);
		board.getSpaceAt(2, 2).setPlayer(player2);
		board.getSpaceAt(1, 3).setPlayer(player1);
		player2.play(board);
		player1.play(board);
		displayBoard.display(board);
		//WHEN
		//appeler algo de recherche victoire et stocker le resultat boolean dans res
		WinnerCheck winnerCheck = new WinnerCheck();
		assertTrue(winnerCheck.horizontalTest(board));
	}

}
