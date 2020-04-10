package tasks.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;

@RunWith(Parameterized.class)
public class RemoveDuplicatesTest {
    @Parameterized.Parameters(name = " ({0}) -> ({1}) ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1,22,1,23", "1,22,23"},
                {"", ""},
                {"1,2,3", "1,2,3"},
                {"a", "a"},
                {"3,1,3", "3,1"},
        });
    }
    private String[] p1;
    private String[] result;

    public RemoveDuplicatesTest(String p1, String result) {
        this.p1 = p1.split(",");
        this.result = result.split(",");
    }
    @Test
    public void notSameArray(){
        assertNotSame(p1, RemoveDuplicates.removeDuplicates(p1));
    }

    @Test
    public void removeDuplicates() {
        assertArrayEquals(result, RemoveDuplicates.removeDuplicates(p1));
    }
}
