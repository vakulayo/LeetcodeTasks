package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/ problem #3
    public int lengthOfLongestSubstring(String string) {
        int l = string.length();
        int i = 0, j = 0;

        Set<Character> unique = new HashSet<>();
        int maxLength = 0;

        if (l == 1) {
            return 1;
        }
        while (j < l - 1) {
            while (unique.add(string.charAt(j)) && (j < l - 1)) {
                j++;
            }
            if (unique.size() > maxLength) {
                maxLength = unique.size();
            }

            while (string.charAt(i) != string.charAt(j)) {
                unique.remove(string.charAt(i));
                i++;
            }
            unique.remove(string.charAt(i));
            i++;
        }
        return maxLength;
    }

    //https://leetcode.com/problems/palindrome-number/description/ problem #9
    public boolean isPalindrome(int x) {
        int y = 0;
        int initial = x;
        while (x >= 1) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return initial == y;
    }

    //https://leetcode.com/problems/valid-parentheses/ problem #20

    public boolean isValid(String s) {
        Stack stack = new Stack();

        String[] allParenthese = s.split("");
        for (String p : allParenthese) {
            if (p.equals("(") || p.equals("{") || p.equals("[")) {
                stack.push(p);
            } else if (stack.isEmpty()) {
                return false;
            } else {

                Object pop = stack.pop();
                if (p.equals(")") && !pop.equals("(")) {
                    return false;
                } else if (p.equals("}") && !pop.equals("{")) {
                    return false;
                } else if (p.equals("]") && !pop.equals("[")) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //https://leetcode.com/problems/longest-common-prefix/ problem #14
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs[0].isEmpty()) {
            return "";
        }
        String commonPart = "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (String word : strs) {
                if (i > word.length() - 1) {
                    return commonPart;
                }
                if (word.charAt(i) != c) {
                    return commonPart;
                }
            }
            commonPart += c;
        }
        return commonPart;
    }

    //https://leetcode.com/problems/longest-palindromic-substring/ problem #5
    public String longestPalindrome(String s) {

        String longest = "";

        for (int k = 0; k < s.length(); k++) {
            String even = maxPalindrome(s, k, k);
            String odd = maxPalindrome(s, k, k + 1);

            if (even.length() > longest.length()) {
                longest = even;
            }

            if (odd.length() > longest.length()) {
                longest = odd;
            }
        }

        return longest;
    }

    private String maxPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    //https://leetcode.com/problems/longest-palindromic-substring/ problem #5 before beautifying
    public String longestPalindrome1(String s) {

        int maxLen = 0, maxI = 0, maxJ = 0;

        for (int k = 0; k < s.length(); k++) {
            int i = k, j = k;

            while (i > 0 && j < s.length() - 1) {
                if (s.charAt(i - 1) == s.charAt(j + 1)) {
                    i--;
                    j++;
                } else {
                    break;
                }
            }

            if (j + 1 - i > maxLen) {
                maxLen = j + 1 - i;
                maxI = i;
                maxJ = j;
            }
        }


        for (int k = 0; k < s.length() - 1; k++) {
            if (s.charAt(k) == s.charAt(k + 1)) {
                int i = k, j = k + 1;

                while (i > 0 && j < s.length() - 1) {
                    if (s.charAt(i - 1) == s.charAt(j + 1)) {
                        i--;
                        j++;
                    } else {
                        break;
                    }
                }

                if (j + 1 - i > maxLen) {
                    maxLen = j + 1 - i;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        return s.substring(maxI, maxJ + 1);
    }


    //https://leetcode.com/problems/reverse-integer/description/ problem #7
    public int reverse(int x) {
        int y = 0;
        while (Math.abs(x) >= 1) {
            long result = 10 * ((long) y) + x % 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }

    //https://leetcode.com/problems/zigzag-conversion/ problem #6
    public String convert(String s, int numRows) {
        String result = "";
        if (s.isEmpty() || s.length() == 1 || numRows == 1) {
            return s;
        }
        for (int row = 0; row < numRows; row++) {
            int position = row;
            int large = 2 * (numRows - 1) - 2 * row;
            int small = 2 * row;
            boolean direction = true;

            while (position < s.length()) {
                result += s.charAt(position);

                if (small == 0 || large == 0) {
                    position += large + small;
                } else {
                    if (direction) {
                        position += large;
                        direction = false;
                    } else {
                        position += small;
                        direction = true;
                    }
                }
            }
        }
        return result;
    }

    //https://leetcode.com/problems/string-to-integer-atoi/description/ problem #8
    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;

        int result = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            if (s.charAt(0) == '-') {
                isNegative = true;
            }
            s = s.substring(1);
        }

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (isNegative) {
                    long check = (long) result * 10 - Character.getNumericValue(c);
                    if (check <= Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    } else {
                        result = result * 10 - Character.getNumericValue(c);
                    }
                } else {
                    long check = (long) result * 10 + Character.getNumericValue(c);
                    if (check >= Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else {
                        result = result * 10 + Character.getNumericValue(c);
                    }
                }
            } else {
                break;
            }
        }
        return result;
    }

    //https://leetcode.com/problems/swap-nodes-in-pairs/ problem #24
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;

        ListNode aa = head;
        ListNode bb = head.next;
        ListNode cc = head.next.next;

        head = bb;
        head.next = aa;
        head.next.next = cc;

        head = head.next;

        while (head != null && head.next != null && head.next.next != null) {
            ListNode b = head.next;
            ListNode c = head.next.next;
            ListNode d = head.next.next.next;

            head.next = c;
            head.next.next = b;
            head.next.next.next = d;
            head = head.next.next;
        }
        return result;
    }
    //https://leetcode.com/problems/swap-nodes-in-pairs/ problem #24 recursion
    public ListNode swapPairsRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairsRecursion(temp.next);
        temp.next = head;
        return temp;
    }


    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(" ---> " + head.val);
            head = head.next;
        }
        System.out.println();
    }
}
