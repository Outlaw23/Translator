package org.example.Spider;

import org.example.Spider.Controllers.Screen_controller;
import org.example.Spider.models.Words.List_Maker;

import java.util.List;

/**
 * Entry point of the application.
 * Responsible for starting the UI and running initial logic.
 */
public class Main {

	/**
	 * Application start method.
	 *
	 * @param args command-line arguments (not used in this application)
	 */
	static void main(@SuppressWarnings("unused") String[] args) {

		Screen_controller.screenContoller();

		List<String> words = List_Maker.getWoorden();

		IO.println(words);
	}
}
