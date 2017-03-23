package com.JeremyPascal.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("Starting apllication");

		TicTacToeController tttController = new TicTacToeController();
		tttController.run();

	}
}
