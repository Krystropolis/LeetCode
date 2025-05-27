package com.sqrt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @DisplayName("zero")
    @Test
    void zero() {
        int actualSqrt = Solution.mySqrt(0);
        int expectedSqrt = 0;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("one")
    @Test
    void one() {
        int actualSqrt = Solution.mySqrt(1);
        int expectedSqrt = 1;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("less than four")
    @Test
    void lessThanFour() {
        int actualSqrt = Solution.mySqrt(3);
        int expectedSqrt = 1;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("int overflow")
    @Test
    void intOverflow() {
        int actualSqrt = Solution.mySqrt(2147395599);
        int expectedSqrt = 46339;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("perfect square")
    @Test
    void perfectSquare() {
        int actualSqrt = Solution.mySqrt(49);
        int expectedSqrt = 7;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("less than perfect square")
    @Test
    void lessThanPerfect() {
        int actualSqrt = Solution.mySqrt(48);
        int expectedSqrt = 6;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("greater than perfect square")
    @Test
    void greaterThanPerfect() {
        int actualSqrt = Solution.mySqrt(50);
        int expectedSqrt = 7;
        assertEquals(expectedSqrt, actualSqrt);
    }

}
