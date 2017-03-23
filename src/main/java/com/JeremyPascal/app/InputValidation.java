package com.JeremyPascal.app;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InputValidation {

	boolean validateInput(Board board, int x, int y) {
		final JPanel panel = new JPanel();
		if (x < 1 || x > board.getWidth()) {
			JOptionPane.showMessageDialog(panel, "Coup invalide, hors du plateau sur l'axe des x", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
		if (y < 1 || y > board.getHeight()) {
			JOptionPane.showMessageDialog(panel, "Coup invalide, hors du plateau sur l'axe des y", "Warning",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
		if (board.getSpaceAt(x, y).getPlayer() != null) {
			JOptionPane.showMessageDialog(panel, "Case occupee", "Warning", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}

	boolean validateInputBot(Board board, int x, int y) {
		return !(x < 1 || y < 1 || x > board.getWidth() || y > board.getHeight() ||board.getSpaceAt(x, y).getPlayer() != null);
	}

}
