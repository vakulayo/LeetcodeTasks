package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Solution solution = new Solution();
        //test1:
        int[] nums1 = {0,1,2,2,3,0,4,2};
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
        }
}