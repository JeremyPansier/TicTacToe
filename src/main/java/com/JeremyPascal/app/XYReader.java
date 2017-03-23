package com.JeremyPascal.app;

import javax.swing.JOptionPane;

public class XYReader {

	public static int readUserInput(char c, PlayerBase currentPlayer) {

		String input;
		boolean isError = true;
		int x = 0;
		
		while (isError) {
			try {
				input = JOptionPane.showInputDialog("joueur : " + currentPlayer.toChar() + " " + c + " =");
				if(input == null){
					System.exit(1);
				}
				x = Integer.parseInt(input);
				isError = false;
			} catch (Exception e) {
				isError = true;
			}
		}
		return x;
	}
}
