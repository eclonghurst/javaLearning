package org.example;

import org.example.mockito.Game;


import static org.example.mockito.RPS.ROCK;

public class Runner {
    public static void main(String[] args) {

        Game game = new Game();
        System.out.println(game.rps(ROCK));

    }
}