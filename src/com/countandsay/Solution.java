package com.countandsay;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        StringBuilder result = new StringBuilder("");

        String s = countAndSay(n-1);
        int len = s.length();
        int count = 1;
        for (int i = 0; i < len; i++) {
            if ((i != len - 1) && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(String.valueOf(count) + s.charAt(i));
                count = 1;
            }
        }
        return result.toString();
    }
}