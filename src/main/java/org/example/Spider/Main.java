package org.example.Spider;

import org.example.Spider.Controllers.Screen_controller;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	private final Screen_controller controller;


	public Main(Screen_controller controller) {
		this.controller = controller;
	}

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) {
		controller.screenContoller();
	}
}