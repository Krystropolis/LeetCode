package com.sqrt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @DisplayName("perfect square")
    @Test
    void perfectSquare() {
        int actualSqrt = Solution.mySqrt(4);
        int expectedSqrt = 2;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("imperfect square")
    @Test
    void imperfectSquare() {
        int actualSqrt = Solution.mySqrt(8);
        int expectedSqrt = 2;
        assertEquals(expectedSqrt, actualSqrt);
    }
    @DisplayName("value 0")
    @Test
    void valueZero() {
        int actualSqrt = Solution.mySqrt(0);
        int expectedSqrt = 0;
        assertEquals(expectedSqrt, actualSqrt);
    }

}
