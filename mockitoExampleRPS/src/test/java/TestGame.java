import org.example.mockito.Game;
import org.example.mockito.RPS;
import org.example.mockito.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

@ExtendWith(MockitoExtension.class)
public class TestGame {

    @Mock
    private Random rand;

    @InjectMocks
    private Game game;

    @Test
    void testRockCorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(2);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.WIN, this.game.rps(RPS.ROCK));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testRockIncorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(1);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.LOSE, this.game.rps(RPS.ROCK));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testRockDraw() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(0);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.DRAW, this.game.rps(RPS.ROCK));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testPaperCorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(0);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.WIN, this.game.rps(RPS.PAPER));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testPaperIncorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(2);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.LOSE, this.game.rps(RPS.PAPER));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testPaperDraw() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(1);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.DRAW, this.game.rps(RPS.PAPER));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testScissorsCorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(1);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.WIN, this.game.rps(RPS.SCISSORS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testScissorsIncorrect() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(0);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.LOSE, this.game.rps(RPS.SCISSORS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }

    @Test
    void testScissorsDraw() {
        // forces the rand.nextInt method to come back as 1
        Mockito.when(this.rand.nextInt(3)).thenReturn(2);

        for (int i = 0; i < 1_000; i++)
            Assertions.assertEquals(Result.DRAW, this.game.rps(RPS.SCISSORS));

        Mockito.verify(this.rand, Mockito.times(1_000)).nextInt(3);
    }
}
