package com.climbingstairs;
import java.util.HashMap;

public class Solution {
    public static int climbStairs(int n) {
//        HashMap<Integer,Integer> memo = new HashMap<>();
//        memo.put(1, 1);
//        memo.put(2, 2);
//        return justKeepClimbing(n, memo);
        if (n <= 2) { return n; }
        return justKeepClimbing(n);
    }

    public static int justKeepClimbing(int n, HashMap<Integer,Integer> memo) {
        // only perform calculation if it hasn't already been done
        if (!memo.containsKey(n)) {
            memo.put(n, justKeepClimbing(n - 1, memo) + justKeepClimbing(n - 2, memo));
        }
        return memo.get(n);
    }

    public static int justKeepClimbing(int n){
        int n1 = 1, n2 = 2, n3 = 0;
        for (int i = 3; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}