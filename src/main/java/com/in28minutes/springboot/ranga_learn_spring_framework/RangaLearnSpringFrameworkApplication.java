package com.in28minutes.springboot.ranga_learn_spring_framework;

import com.in28minutes.springboot.ranga_learn_spring_framework.game.GameRunner;
import com.in28minutes.springboot.ranga_learn_spring_framework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RangaLearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RangaLearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
