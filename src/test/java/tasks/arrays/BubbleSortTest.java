package tasks.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class BubbleSortTest {
    @Parameterized.Parameters(name = " ({0}) -> ({1}) ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1,2,3,4", "1,2,3,4"},
                {"", ""},
                {"10,6,4", "4,6,10"},
                {"2,5,0,1,5", "0,1,2,5,5"},
                {"111,1,111", "1,111,111"},
                {"5656,544,5,2,-100,656,784,0", "-100,0,2,5,544,656,784,5656"}
        });
    }
    private int[] p1;
    private int[] result;

    public BubbleSortTest(String p1, String result) {
        this.p1 = Arrays
                .stream(p1.split(","))
                .filter(s -> !"".equals(s))
                .mapToInt(Integer::parseInt)
                .toArray();
        this.result = Arrays
                .stream(result.split(","))
                .filter(s -> !"".equals(s))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    @Test
    public void bubbleSort() {
        BubbleSort.bubbleSort(p1);
        assertArrayEquals(result, p1);
    }
}
