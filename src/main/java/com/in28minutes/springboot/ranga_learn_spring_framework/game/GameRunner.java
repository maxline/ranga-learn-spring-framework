package com.in28minutes.springboot.ranga_learn_spring_framework.game;

public class GameRunner {
    
    private final MarioGame game;
    
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
