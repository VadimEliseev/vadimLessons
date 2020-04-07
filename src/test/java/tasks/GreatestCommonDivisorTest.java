package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void gcd() {
        assertEquals(1, GreatestCommonDivisor.gcd(2, 3));
        assertEquals(1, GreatestCommonDivisor.gcd(3, 2));
        assertEquals(16, GreatestCommonDivisor.gcd(16, 32));
        assertEquals(16, GreatestCommonDivisor.gcd(32, 16));
        assertEquals(4, GreatestCommonDivisor.gcd(20, 44));
        assertEquals(4, GreatestCommonDivisor.gcd(44, 20));
        assertEquals(5, GreatestCommonDivisor.gcd(35, 55));
        assertEquals(5, GreatestCommonDivisor.gcd(55, 35));
        assertEquals(11, GreatestCommonDivisor.gcd(22, 121));
        assertEquals(1, GreatestCommonDivisor.gcd(101, 17));
        assertEquals(1, GreatestCommonDivisor.gcd(12, 35));
    }
}
