package com.in28minutes.springboot.ranga_learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //@Autowired
    private final GamingConsole game;
    
    public GameRunner(@Qualifier("pacmanGame") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
