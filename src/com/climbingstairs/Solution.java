package com.climbingstairs;

public class Solution {
    private static int pathCount = 0;
    public static int climbStairs(int n) {
        if (n == 0){ return 0; }
        justKeepClimbing(n, 0);
        int result = getPathCount();
        setPathCount(0);
        return result;
    }

    public static void justKeepClimbing(int n, int totalSteps) {
        if (totalSteps == n) {
            setPathCount(getPathCount() + 1);
        } else if (totalSteps < n) {
            justKeepClimbing(n, totalSteps + 1);
            justKeepClimbing(n, totalSteps + 2);
        }
    }

    public static void setPathCount(int pathCount) {
        Solution.pathCount = pathCount;
    }

    public static int getPathCount() {
        return pathCount;
    }
}