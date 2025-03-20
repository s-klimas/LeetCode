package pl.sebastianklimas.lc26RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }
}
