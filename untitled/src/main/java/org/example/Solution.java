package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.min;

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

    // https://leetcode.com/problems/add-two-numbers/description/ problem #2
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int additionalOne = 0;

        ListNode resultList = new ListNode();
        ListNode currentNode = resultList;
        while (l1 != null || l2 != null || additionalOne != 0) {

            int sum = additionalOne;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            additionalOne = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }

        return resultList.next;
    }

    //https://leetcode.com/problems/median-of-two-sorted-arrays/description/ problem #4
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double result1 = -10000001, result2 = -10000001;

        int i = 0, j = 0;

        int position = (n + m) / 2;
        while (i + j <= position) {
            result1 = result2;
            if (i == n) {
                result2 = nums2[j];
                j++;
            } else if (j == m) {
                result2 = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                result2 = nums1[i];
                i++;
            } else {
                result2 = nums2[j];
                j++;
            }
        }


        if ((n + m) % 2 == 1) {
            return result2;
        } else {
            return (result1 + result2) / 2;
        }


    }
}
