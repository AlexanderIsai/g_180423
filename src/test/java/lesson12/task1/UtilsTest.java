package lesson12.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    private int[] result;

    @BeforeEach
    public void init(){
        result = Utils.getArrayBySize(7);
    }

    @Test
    public void checkCalculatedValue(){
        int actual = Utils.calculate(10, 7, 2, 3);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkArrayLength(){
//        int[] result = Utils.getArrayBySize(7);
        int actual = result.length;
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isArrayNotNull(){
//        int[] result = Utils.getArrayBySize(3);
        Assertions.assertNotNull(result);
    }

    @Test
    public void checkArrayValue() {
//        int[] result = Utils.getArrayBySize(4);
        int actual = result[2];
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
}
