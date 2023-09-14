import org.example.Factorials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Factorials.ReverseFactorial;

public class FactorialsTest {

    @Test
    void testFactorial(){
        Assertions.assertEquals("5!", ReverseFactorial("120"));
        Assertions.assertEquals("6!", ReverseFactorial("720"));
    }

    @Test
    void testZeroFactorial(){
        Assertions.assertEquals("0!", ReverseFactorial("1"));
    }

    @Test
    void testNotFactorial(){
        Assertions.assertEquals("NONE", ReverseFactorial("121"));
    }

}
