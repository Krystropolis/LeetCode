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
        int dupes = 0;
        while (tailIndex < len){
            if (nums[currentIndex] == nums[tailIndex]){
                dupes++;
                tailIndex++;
            } else if (tailIndex - currentIndex > 1) {
                nums[currentIndex + 1] = nums[tailIndex];
                currentIndex++;
                tailIndex++;
            }
        }

        for (int i = 0; i < nums.length; i++){
            System.out.print("[" + nums[i] + "]");
        }

        return len - dupes;
    }
}
