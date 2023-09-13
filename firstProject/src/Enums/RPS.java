package Enums;

import java.util.Random;
public class RPS {
    private Random random = new Random();

    public String playGame(RockPaperScissors guess) {
        int randomNum = this.random.nextInt(3);
        RockPaperScissors cpuAnswer = null;
        if (randomNum == 0) cpuAnswer = RockPaperScissors.ROCK;
        else if (randomNum == 1) cpuAnswer = RockPaperScissors.PAPER;
        else cpuAnswer = RockPaperScissors.SCISSORS;

        if (cpuAnswer == guess) {
            return "You both played " + guess + ", It's a draw!";
        } else if ((cpuAnswer == RockPaperScissors.ROCK && guess == RockPaperScissors.PAPER) || (cpuAnswer == RockPaperScissors.SCISSORS && guess == RockPaperScissors.ROCK) || (cpuAnswer == RockPaperScissors.PAPER && guess == RockPaperScissors.SCISSORS)) {
            return "You played: " + guess + " Cpu played: " + cpuAnswer + ", You win!";
        } else if ((cpuAnswer == RockPaperScissors.ROCK && guess == RockPaperScissors.SCISSORS) || (cpuAnswer == RockPaperScissors.SCISSORS && guess == RockPaperScissors.PAPER) || (cpuAnswer == RockPaperScissors.PAPER && guess == RockPaperScissors.ROCK)) {
            return "You played: " + guess + " Cpu played: " + cpuAnswer + ", Cpu wins!";
        }
        return null;
    }

    public enum winlosedraw {
        WIN, LOSE, DRAW;
    }
}
