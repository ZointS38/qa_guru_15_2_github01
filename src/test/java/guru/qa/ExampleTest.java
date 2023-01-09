package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest()  {
        Assertions.assertFalse(2 >= 1);
    }

    @Test
    void exampleTest1()  {
        Assertions.assertTrue(3 + 2 == 45);
    }
}
