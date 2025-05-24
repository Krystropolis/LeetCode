package com.addbinary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @DisplayName("case5")
    @Test
    void case5() {
        String actualBinary = Solution.addBinary("1111", "1111");
        String expectedBinary = "11110";
        assertEquals(expectedBinary, actualBinary);
    }
    @DisplayName("case4")
    @Test
    void case4() {
        String actualBinary = Solution.addBinary("10", "0");
        String expectedBinary = "10";
        assertEquals(expectedBinary, actualBinary);
    }
    @DisplayName("case3")
    @Test
    void case3() {
        String actualBinary = Solution.addBinary("0", "1011");
        String expectedBinary = "1011";
        assertEquals(expectedBinary, actualBinary);
    }
    @DisplayName("case2")
    @Test
    void case2() {
        String actualBinary = Solution.addBinary("1010", "1011");
        String expectedBinary = "10101";
        assertEquals(expectedBinary, actualBinary);
    }
    @DisplayName("case1")
    @Test
    void case1() {
        String actualBinary = Solution.addBinary("11", "1");
        String expectedBinary = "100";
        assertEquals(expectedBinary, actualBinary);
    }
    @DisplayName("case0")
    @Test
    void case0() {
        String actualBinary = Solution.addBinary("0", "0");
        String expectedBinary = "0";
        assertEquals(expectedBinary, actualBinary);
    }
}