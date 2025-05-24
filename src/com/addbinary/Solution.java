package com.addbinary;
/***
 Given two binary strings a and b, return their sum as a binary string.

 Example 1:
 Input: a = "11", b = "1"Output: "100"

 Example 2:
 Input: a = "1010", b = "1011"
 Output: "10101"
 ***/
public class Solution {
    public static String addBinary(String a, String b) {
        boolean aLarge = false;
        int lgLen = b.length();
        int smLen = a.length();
        if (a.length() > b.length()) {
            aLarge = true;
            lgLen = a.length();
            smLen = b.length();
        }
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        for (int i = 0; i < lgLen; i++) {
            char aChar = (i >= smLen && !aLarge) ? '0' : a.charAt(a.length() - 1 - i);
            char bChar = (i >= smLen && aLarge) ? '0' : b.charAt(b.length() - 1 - i);

            if (aChar == '0' && bChar == '0' && carry == '0') {
                sb.insert(0, '0');
                carry = '0';
            } else if (aChar == '0' && bChar == '0' && carry == '1') {
                sb.insert(0,'1');
                carry = '0';
            } else if (aChar == '1' && bChar == '1' && carry == '0') {
                sb.insert(0,'0');
                carry = '1';
            } else if (aChar == '1' && bChar == '1' && carry == '1') {
                sb.insert(0,'1');
                carry = '1';
            } else if ((aChar == '0' && bChar == '1' && carry == '0') || (aChar == '1' && bChar == '0' && carry == '0')) {
               sb.insert(0,'1');
                carry = '0';
            } else if ((aChar == '0' && bChar == '1' && carry == '1') || (aChar == '1' && bChar == '0' && carry == '1')) {
                sb.insert(0,'0');
                carry = '1';
            }
        }
        if (carry == '1') { sb.insert(0,'1'); }
        return sb.toString();
    }
}


// solution beats
// 42.10% runtime (2ms)
// 80.77% memory (42.19mb)
