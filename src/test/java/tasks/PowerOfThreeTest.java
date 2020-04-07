package tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfThreeTest {

    @Test
    public void powerOfThree() {
        assertTrue(PowerOfThree.powerOfThree(1));
        assertTrue(PowerOfThree.powerOfThree(3));
        assertTrue(PowerOfThree.powerOfThree(9));
        assertTrue(PowerOfThree.powerOfThree(27));
        assertTrue(PowerOfThree.powerOfThree(81));
        assertFalse(PowerOfThree.powerOfThree(0));
        assertFalse(PowerOfThree.powerOfThree(2));
        assertFalse(PowerOfThree.powerOfThree(4));
        assertFalse(PowerOfThree.powerOfThree(6));
        assertFalse(PowerOfThree.powerOfThree(33));
        assertFalse(PowerOfThree.powerOfThree(66));
        assertFalse(PowerOfThree.powerOfThree(100));
        assertFalse(PowerOfThree.powerOfThree(123));
    }
}
