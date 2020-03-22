package com.removeduplicates;

// note: you cannot change the size of an array in java,
// instead we will move duplicates to the end of the array and report a shortened length (len - duplicates)
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        // there cannot be any duplicates
        if (len == 0 || len == 1) { return len; }

        int currentIndex = 0;
        int tailIndex = 1;
        while (tailIndex < len){
            if (nums[currentIndex] != nums[tailIndex]){
                currentIndex++;
                nums[currentIndex] = nums[tailIndex];
                tailIndex++;
            } else {
                tailIndex++;
            }
        }

        return currentIndex + 1;
    }
}
