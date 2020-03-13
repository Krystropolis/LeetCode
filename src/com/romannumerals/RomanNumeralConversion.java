package com.romannumerals;

class RomanNumeralConversion {
    public int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            // to determine whether any subtraction should be done
            char nextLetter = '?';
            if (i < s.length() - 1) {
                nextLetter = s.charAt(i + 1);
            }

            // add letter to value
            switch (letter) {
                case 'I':
                    if (nextLetter == 'V') {
                        value += 4;
                        i++;
                    } else if (nextLetter == 'X') {
                        value += 9;
                        i++;
                    } else {
                        value += 1;
                    }
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'X':
                    if (nextLetter == 'L') {
                        value += 40;
                        i++;
                    } else if (nextLetter == 'C') {
                        value += 90;
                        i++;
                    } else {
                        value += 10;
                    }
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'C':
                    if (nextLetter == 'D') {
                        value += 400;
                        i++;
                    } else if (nextLetter == 'M') {
                        value += 900;
                        i++;
                    } else {
                        value += 100;
                    }
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'M':
                    value += 1000;
                    break;
            }
        }

        return value;
    }
}