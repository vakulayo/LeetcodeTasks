package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        while (l1 != null || l2 != null || additionalOne !=0) {

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
}
