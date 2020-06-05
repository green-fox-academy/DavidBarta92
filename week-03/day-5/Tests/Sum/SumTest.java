package Sum;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void summation() {
        Sum sum = new Sum();
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        assertEquals(15, sum.summation(list));
    }
    @Test
    public void emptyList() {
        Sum sum = new Sum();
        List<Integer> list = Arrays.asList();
        assertEquals(0, sum.summation(list));
    }
    @Test
    public void oneElement() {
        Sum sum = new Sum();
        List<Integer> list = Arrays.asList(1);
        assertEquals(1, sum.summation(list));
    }

}