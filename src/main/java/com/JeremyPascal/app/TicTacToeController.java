package com.JeremyPascal.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeController {
	Player player1;
	Player player2;
	Board board;

	public void run() {
		List<Move> moves = new ArrayList<Move>();
		BoardDisplay displayBoard = new BoardDisplay();
		Player currentPlayer = initializationGame();
		int maximumMoveNumber = board.getHeight() * board.getWidth();
		WinnerCheck winnerCheck = new WinnerCheck();

		displayBoard.display(board);
		while ((moves.size() < maximumMoveNumber) && !winnerCheck.testWinner(board)){
			Space space = currentPlayer.play(board);			
			Move move = new Move(space, currentPlayer);
			System.out.println("nouveau coup");
			moves.add(move);
			displayBoard.display(board);			
			currentPlayer = (currentPlayer == player2) ? player1 : player2;
		}

		if (moves.size() == maximumMoveNumber && !winnerCheck.testWinner(board)) {
			System.out.println("match nul");
		}
	}
	
	private Player initializationGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Humain?  Y/N?");
		String rep = sc.nextLine();
		if (rep.compareTo("N")!=0) {
			player1 = new Human( 'X');
		} else {
			player1 = new Bot( 'X');
		}
		System.out.println("Humain?  Y/N?");
		rep = sc.nextLine();
		if (rep.compareTo("N")!=0) {
			player2 = new Human('O');
		} else {
			player2 = new Bot('O');
		}
		int number;
		do {
			System.out.println("Number of lines and columns ?");
			rep = sc.nextLine();
			number = Integer.parseInt(rep);
			board = new Board(number,number);
		} while (number > 9);
		sc.close();
		return player1;
	}

}
