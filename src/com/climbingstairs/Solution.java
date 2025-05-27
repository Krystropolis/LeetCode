package com.climbingstairs;
import java.util.HashMap;

public class Solution {
    public static int climbStairs(int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return justKeepClimbing(n, memo);
    }

    public static int justKeepClimbing(int n, HashMap<Integer,Integer> memo) {
        // only perform calculation if it hasn't already been done
        if (!memo.containsKey(n)) {
            memo.put(n, justKeepClimbing(n - 1, memo) + justKeepClimbing(n - 2, memo));
        }
        return memo.get(n);
    }
}