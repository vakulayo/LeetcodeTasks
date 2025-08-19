package org.example;

public class Solution {

    // https://leetcode.com/problems/remove-element/description/ problem #27
    public int removeElement(int[] nums, int val) {

        int l = nums.length;

        int i = 0;
        int j = l - 1;

        if (l == 0) {
            return 0;
        }
        while (i < j) {
            if (nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                nums[j] = val;
                i++;
                j--;
            } else {
                if (nums[i] == val) {
                    j--;
                } else {
                    i++;
                }
            }
        }

        if (nums[i] == val) {
            return i;
        } else {
            return i + 1;
        }
    }
}
