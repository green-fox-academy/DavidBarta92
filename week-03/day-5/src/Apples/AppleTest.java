package Apples;
import static org.junit.Assert.assertEquals;

public class AppleTest {

    public void getApple() {
        Apple apple = new Apple();
        assertEquals("apple", apple.getApple());
    }
}
