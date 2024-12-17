package com.in28minutes.springboot.ranga_learn_spring_framework.game;

public class GameRunner {
    
    private final GamingConsole game;
    
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
