package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Solution solution = new Solution();
        //test1:
        int[] nums1 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val1 = 2;
        System.out.println(solution.removeElement(nums1, val1) + " //Should be 5");

        //test2:
        int[] nums2 = {3};
        int val2 = 2;
        System.out.println(solution.removeElement(nums2, val2) + " //Should be 1");

        //test3:
        int[] nums3 = {2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        int val3 = 2;
        System.out.println(solution.removeElement(nums3, val3) + " //Should be 5");


        //test4:
        int[] nums4 = {2};
        int val4 = 2;
        System.out.println(solution.removeElement(nums4, val4) + " //Should be 0");


        //test1:
        ListNode l11 = createLinkedList(Arrays.asList(3, 4, 2));
        ListNode l21 = createLinkedList(Arrays.asList(4, 6, 5));
        ListNode listNode1 = solution.addTwoNumbers(l11, l21); //Should be [7, 0, 8]

        //test2:
        ListNode l12 = createLinkedList(List.of(0));
        ListNode l22 = createLinkedList(List.of(0));
        ListNode listNode2 = solution.addTwoNumbers(l12, l22); //Should be [0]

        //test3:
        ListNode l13 = createLinkedList(Arrays.asList(9,9,9,9,9,9,9));
        ListNode l23 = createLinkedList(Arrays.asList(9,9,9,9));
        ListNode listNode3 = solution.addTwoNumbers(l13, l23); //Should be [0]


    }

    public static ListNode createLinkedList(List<Integer> l) {
        ListNode result = null;

        for (Integer elem : l) {
            ListNode newNode = new ListNode();
            newNode.val = elem;
            newNode.next = result;
            result = newNode;
        }

        return result;
    }
}