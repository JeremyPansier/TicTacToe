package com.JeremyPascal.app;

public class BoardDisplay {

	public BoardDisplay() {

	}

	public void display(Board board) {
		int width = board.getWidth();
		int height = board.getHeight();
		displayHeadNumbers(board);
		displayFirstLine(board);
		for (int i = 1; i <= width; i++) {
			displayFirstBlockLine(board);
			System.out.print(i + " |");
			for (int j = 1; j <= height; j++) {
				System.out.print("  " + board.getSpaceAt(i, j).getItem() + "  ");
				System.out.print("|");
			}
			System.out.println();
			displayThirdBlockLine(board);
		}
	}

	private void displayHeadNumbers(Board board) {
		int height = board.getHeight();
		System.out.print("  ");
		for (int j = 1; j <= height; j++) {
			System.out.print("   " + j + "  ");
		}
		System.out.println();
	}

	private void displayFirstLine(Board board) {
		int height = board.getHeight();
		System.out.print("  ");
		for (int j = 1; j <= height; j++) {
			System.out.print(" _____");
		}
		System.out.println();

	}

	private void displayFirstBlockLine(Board board) {
		int height = board.getHeight();
		for (int j = 1; j <= height; j++) {
			if (j == 1) {
				System.out.print("  |     ");
			} else
				System.out.print("|     ");
		}
		System.out.print("|");
		System.out.println();

	}

	private void displayThirdBlockLine(Board board) {
		int height = board.getHeight();
		for (int j = 1; j <= height; j++) {
			if (j == 1) {
				System.out.print("  |_____");
			} else
				System.out.print("|_____");
		}
		System.out.print("|");
		System.out.println();

	}

}
