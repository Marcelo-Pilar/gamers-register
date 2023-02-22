package com.example.game_register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameRegisterApplication {

	private static final Logger log = LoggerFactory.getLogger(GameRegisterApplication.class);

	public static void main(String[] args) {
		log.info("Starting the Gamers Register API...");
		SpringApplication.run(GameRegisterApplication.class, args);
		log.info("Gamers Register started successfully and ready to receive requisitions.");


	}

}
