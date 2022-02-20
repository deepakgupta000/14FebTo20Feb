package com.date15Feb;

public class Feb14 {

	 public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
	        //"1.) https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
	        int result = 0;
	        for (int i = 0; i < startTime.length; i++) {
	            result += startTime[i] <= queryTime && queryTime <= endTime[i] ? 1 : 0;
	        }
	        return result;
	    }

	    public int[] runningSum(int[] nums) {
	        //2.) https://leetcode.com/problems/running-sum-of-1d-array/
	        for (int i = 1; i < nums.length; i++) {
	            nums[i] += nums[i - 1];
	        }
	        return nums;
	    }

	    public static void main(String[] args) {
	        /*3.)  Given two arrays, find the intersection between them?
	        Input : int[]  arr1 = {1, 2, 3, 4, 5, 6};
	        int[] arr2 = {2, 3, 4, 7, 8};
	        Output : { 2, 3, 4}*/

	        int[] arr1 = {1, 2, 3, 4, 5, 6};   //Intersection means where two or more point meet .
	        int[] arr2 = {2, 3, 4, 7, 8};
	        int i = 0;
	        int j = 0;
	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] == arr2[j]) {
	                System.out.print(arr1[i]);         //2,3,4
	                i++;
	                j++;
	            } else if (arr1[i] > arr2[j]) {
	                j++;
	            } else {
	                i++;
	            }
	        }
	        setLargest();
	    }

	    private static void setLargest() {
	        //Java Program to find Second Largest Number in an Array

	      int integers[] = {12,34,55,3,4,66};
		int max = integers[0];
		int secondmax = integers[0];

		for (int i =0; i<=5; i++){
			if (integers[i] > max) max = integers[i];
		}
		for (int i =0; i<=5; i++){
			if (integers[i] > secondmax && integers[i] < max) secondmax = integers[i];
		}
		System.out.println(" the maximum number is: " + max + "\n the second maximum number is:" + secondmax);
	    }
}
