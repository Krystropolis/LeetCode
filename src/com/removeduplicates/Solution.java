package com.removeduplicates;

import java.util.ArrayList;

// note: you cannot change the size of an array in java,
// instead we will move duplicates to the end of the array and report a shortened length (len - duplicates)
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        // there cannot be any duplicates
        if (len < 2) { return len; }

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

    // if you need an array that can implement inserts or removal, and memory is not an issue,
    // it's better to work with an array list
    public int removeDuplicates(ArrayList<Integer> nums){
        int len = nums.size();
        if (len < 2) { return len; }

        for (int i = 0; i < len; i++) {
            if (i != len - 1 && nums.get(i) == nums.get(i + 1)){
                nums.remove(i + 1);
                i--;
                len--;
            }
        }
        return nums.size();
    }
}
