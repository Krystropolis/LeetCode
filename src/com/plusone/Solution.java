package com.plusone;

public class Solution {
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (i == digits.length - 1) ? digits[i] + 1 + carry : digits[i] + carry;
            carry = 0;
            if (digits[i] > 9) {
                carry = digits[i] / 10;
                digits[i] = digits[i] - 10;
            }
            else if (i == digits.length - 1) { break; }
            if (i == 0 && carry > 0) {
                int[] n = new int[digits.length + 1];
                n[0] = carry;
                System.arraycopy(digits, 0, n, 1, digits.length);
                return n;
            }
        }
        return digits;
    }
}
