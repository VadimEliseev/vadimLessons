package tasks.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class ReverseArrayTest {
    @Parameterized.Parameters(name = " ({0}) -> ({1}) ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1,2,3,4", "4,3,2,1"},
                {"", ""},
                {"a,b,c", "c,b,a"},
                {"2,5,0,1,5", "5,1,0,5,2"},
                {"a,a,a,b,b", "b,b,a,a,a"}
        });
    }
    private String[] p1;
    private String[] result;

    public ReverseArrayTest(String p1, String result) {
        this.p1 = Arrays
                .stream(p1.split(","))
                .filter(s -> !"".equals(s))
                .toArray(String[]::new);
        this.result = Arrays
                .stream(result.split(","))
                .filter(s -> !"".equals(s))
                .toArray(String[]::new);
    }


    @Test
    public void reverseArray() {
        assertArrayEquals(result, ReverseArray.reverseArray(p1));
    }

    @Test
    public void isNotSameArray(){
        assert(ReverseArray.reverseArray(p1) != p1);
    }
}
