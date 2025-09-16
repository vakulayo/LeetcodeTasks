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

        //test1:
        System.out.println(solution.isPalindrome(1234) + " //Should be false");
        System.out.println(solution.isPalindrome(1234321) + " //Should be true");

        //test1:
        System.out.println(solution.isValid("()[]{}") + " //Should be true");
        System.out.println(solution.isValid("([)]") + " //Should be false");
        System.out.println(solution.isValid("]") + " //Should be false");

        //test
        String[] words = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(words) + " //Should be fl");
        String[] words2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(words2) + " //Should be \"\"");

        //test
        System.out.println(solution.longestPalindrome("abaa") + " //Should be aba");
        System.out.println(solution.longestPalindrome("abbaa") + " //Should be abba");

        System.out.println(solution.longestPalindrome1("abaa") + " //Should be aba");
        System.out.println(solution.longestPalindrome1("abbaa") + " //Should be abba");

        //test
        System.out.println(solution.reverse(123) + " //Should be 321");
        System.out.println(solution.reverse(120) + " //Should be 21");
        System.out.println(solution.reverse(-123) + " //Should be -321");
        System.out.println(solution.reverse(1534236469) + " //Should be 0");
        System.out.println(solution.reverse(-1563847412) + " //Should be 0");

        //test
        System.out.println(solution.convert("PAYPALISHIRING", 3) + " //Should be PAHNAPLSIIGYIR");
        System.out.println(solution.convert("PAYPALISHIRING", 4) + " //Should be PINALSIGYAHRPI");


        //test
        System.out.println(solution.myAtoi("  42") + " //Should be 42");
        System.out.println(solution.myAtoi("-042") + " //Should be -42");
        System.out.println(solution.myAtoi("1337c0d3") + " //Should be 1337");
        System.out.println(solution.myAtoi("0-1") + " //Should be 0");
        System.out.println(solution.myAtoi("words and 987") + " //Should be 0");
        System.out.println(solution.myAtoi("000023") + " //Should be 23");
        System.out.println(solution.myAtoi("+133") + " //Should be 133");
        System.out.println(solution.myAtoi("-91283472332") + " //Should be -2147483648");


        //test
        printLinkedList(solution.swapPairs(createLinkedList(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1))));
        System.out.print("// Should be  ---> 2 ---> 1 ---> 4 ---> 3 ---> 6 ---> 5 ---> 8 ---> 7");
        printLinkedList(solution.swapPairs(createLinkedList(Arrays.asList(3, 2, 1))));
        System.out.print("// Should be   ---> 2 ---> 1 ---> 3");
        printLinkedList(solution.swapPairs(createLinkedList(Arrays.asList(2, 1))));
        System.out.print("// Should be    ---> 2 ---> 1");

        printLinkedList(solution.swapPairsRecursion(createLinkedList(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1))));
        System.out.println("// Should be  ---> 2 ---> 1 ---> 4 ---> 3 ---> 6 ---> 5 ---> 8 ---> 7");

        //test
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}) + " //Should be 49");
        System.out.println(solution.maxArea(new int[]{1,1}) + " //Should be 1");
    }


    public static void printLinkedList(ListNode head) {
        System.out.println();
        while (head != null) {
            System.out.print(" ---> " + head.val);
            head = head.next;
        }
        System.out.println();
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