package org.example.mockito;
import java.util.Random;

public class Game {
    private Random rand = new Random();

    public Result rps(RPS player) {
        RPS cpu = RPS.values()[this.rand.nextInt(RPS.values().length)];

        System.out.println("Player: " + player);
        System.out.println("CPU: " + cpu);

        return player.beats(cpu);
    }
}

