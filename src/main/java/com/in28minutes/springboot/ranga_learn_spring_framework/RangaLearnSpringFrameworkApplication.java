package com.in28minutes.springboot.ranga_learn_spring_framework;

import com.in28minutes.springboot.ranga_learn_spring_framework.game.GameRunner;
import com.in28minutes.springboot.ranga_learn_spring_framework.game.GamingConsole;
import com.in28minutes.springboot.ranga_learn_spring_framework.game.MarioGame;
import com.in28minutes.springboot.ranga_learn_spring_framework.game.PacmanGame;
import com.in28minutes.springboot.ranga_learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RangaLearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RangaLearnSpringFrameworkApplication.class, args);
		GamingConsole game = new MarioGame();
		GamingConsole game2 = new SuperContraGame();
		GamingConsole game3 = new PacmanGame();
		GameRunner runner = new GameRunner(game3);
		runner.run();
	}

}
