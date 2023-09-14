import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    void testAddNums(){
        Assertions.assertEquals(2, Calculator.CalcAdd(1,1));
        Assertions.assertEquals(8, Calculator.CalcAdd(2,6));
        Assertions.assertEquals(12, Calculator.CalcAdd(4,8));
    }

    // Subtractions
    @Test
    void testSubtractNums(){
        Assertions.assertEquals(4, Calculator.CalcSubtract(8,4));
        Assertions.assertEquals(16, Calculator.CalcSubtract(17,1));
        Assertions.assertEquals(16, Calculator.CalcSubtract(20,4));
    }

    @Test
    void testDivideNums(){
        Assertions.assertEquals(2, Calculator.CalcDivide(8, 4));
        Assertions.assertEquals(3, Calculator.CalcDivide(15, 5));
        Assertions.assertEquals(2, Calculator.CalcDivide(30, 15));
    }

    @Test
    void testMultiplyNums(){
        Assertions.assertEquals(10, Calculator.CalcMultiply(5, 2));
        Assertions.assertEquals(1, Calculator.CalcMultiply(1, 1));
        Assertions.assertEquals(20, Calculator.CalcMultiply(10, 2));
    }

    @Test
    void testModNums(){
        Assertions.assertEquals(2, Calculator.CalcMod(12, 5));
        Assertions.assertEquals(0, Calculator.CalcMod(16, 4));
    }

}
