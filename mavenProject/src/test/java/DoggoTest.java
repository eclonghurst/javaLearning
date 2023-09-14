import org.example.Doggo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {

    @Test
    void testListSize(){
        Doggo doggo = new Doggo();
        Assertions.assertEquals(99,doggo.DoggoComp(1).size());
    }

    @Test
    void testNoFirstDoggo(){
        Doggo doggo = new Doggo();
        Assertions.assertFalse(doggo.DoggoComp(1).contains("1st"));
    }

    @Test
    void testHasFirstDoggo(){
        Doggo doggo = new Doggo();
        Assertions.assertTrue(doggo.DoggoComp(99).contains("1st"));
    }

    @Test
    void testNoSecondDoggo(){
        Doggo doggo = new Doggo();
        Assertions.assertFalse(doggo.DoggoComp(2).contains("2nd"));
    }

}
