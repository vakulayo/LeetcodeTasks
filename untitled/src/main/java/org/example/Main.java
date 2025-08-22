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
        ListNode l13 = createLinkedList(Arrays.asList(9, 9, 9, 9, 9, 9, 9));
        ListNode l23 = createLinkedList(Arrays.asList(9, 9, 9, 9));
        ListNode listNode3 = solution.addTwoNumbers(l13, l23); //Should be [0]


        //test1:
        int[] nums111 = {-100, -70, 0, 3, 4};
        int[] nums222 = {-150, -50, 4, 7};
        System.out.println(solution.findMedianSortedArrays(nums111, nums222) + " //Should be 0");

        //test2:
        int[] nums1111 = {-100, -70, 0, 3};
        int[] nums2222 = {-150, -50, 4, 7};
        System.out.println(solution.findMedianSortedArrays(nums1111, nums2222) + " //Should be -25.0");

        //test3:
        int[] nums11111 = {1, 2};
        int[] nums22222 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums11111, nums22222) + " //Should be 2.5");

        //test4:
        int[] nums111111 = {1, 2};
        int[] nums222222 = {3};
        System.out.println(solution.findMedianSortedArrays(nums111111, nums222222) + " //Should be 2");

        //test1:
        String ss = "6haf2chsf7x47uji4p00qa03b51talb7jlil0eebdr1fydgc54wyatd560g8ync6csr41mbhkvvk0w7lbbztcrrn7j1ms4h6qlj7";
        String s = "'*y]5\\)&?;!y\"ak7(!x;qw]n\\442h{8wy?\\_d$?i~$31ws[.ju=}]'0&x36z:~bav-.?68%>!hy<tc5r{9d.:v~hd:~pi9kac12)";
        String sss = "aab";
        System.out.println(solution.lengthOfLongestSubstring(sss) + " //Should be 2");
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