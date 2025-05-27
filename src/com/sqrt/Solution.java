package com.sqrt;

public class Solution {
    private static int result = -1;
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        Solution s = new Solution();
        s.binarySearch(x, 0, x/2);
        return Solution.result;
    }

    private void binarySearch(int x, int lower, int upper){
        if (lower > upper){ Solution.result = upper; return; }
        int mid = lower + (upper - lower)/2;
        long sq = (long) mid * mid;

        if (sq > Integer.MAX_VALUE || sq > x) { binarySearch(x, lower,mid - 1);}
        else if (sq < x) { binarySearch(x, mid + 1, upper); }
        else { Solution.result = mid; return; }
    }
}