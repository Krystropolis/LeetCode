package com.climbingstairs;
import com.climbingstairs.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @DisplayName("climb to two")
    @Test
    void two() {
        int actualSteps = Solution.climbStairs(2); //11, 2
        int expectedSteps = 2;
        assertEquals(expectedSteps, actualSteps);
    }
    @DisplayName("climb to 3")
    @Test
    void three() {
        int actualSteps = Solution.climbStairs(3); //111, 12, 21
        int expectedSteps = 3;
        assertEquals(expectedSteps, actualSteps);
    }
    @DisplayName("climb to five")
    @Test
    void five() {
        int actualSteps = Solution.climbStairs(5); //11111, 1112, 1121, 1211, 2111, 221, 212, 122
        int expectedSteps = 8;
        assertEquals(expectedSteps, actualSteps);
    }
}
