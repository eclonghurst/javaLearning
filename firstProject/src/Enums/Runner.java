package Enums;

public class Runner {
    public static void main(String[] args) {

        RPS game = new RPS();
        game.playGame(RockPaperScissors.ROCK);
        System.out.println(game.playGame(RockPaperScissors.ROCK));

    }
}
