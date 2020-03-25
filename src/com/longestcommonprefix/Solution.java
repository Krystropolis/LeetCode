package com.longestcommonprefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int charLimit = findShortestWordLength(strs);
        String s = strs[0].substring(0, charLimit);
        String result = "";
        for (int i = 0; i < charLimit; i++) { // for each character
            for (int j = 1; j < strs.length; j++) { // for each word
                if (s.charAt(i) != strs[j].charAt(i)) { // if the character at index i does not match for each word
                    return result;
                }
            }
            result = strs[0].substring(0, i + 1);
        }
        return result;
    }

    public int findShortestWordLength(String[] strs) {
        int shortestLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            shortestLen = strs[i].length() < shortestLen ? strs[i].length() : shortestLen;
        }
        return shortestLen;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] input1 = {"flower","flow","flight"};
        String[] input2 = {"dog","racecar","car"};
        String[] input3 = {"antitrust","antithesis","antitragus"};
        String[] input4 = {"antitrust","antithesis","anticlimactic"};
        System.out.println(s.longestCommonPrefix(input1));
        System.out.println(s.longestCommonPrefix(input2));
        System.out.println(s.longestCommonPrefix(input3));
        System.out.println(s.longestCommonPrefix(input4));
    }
}