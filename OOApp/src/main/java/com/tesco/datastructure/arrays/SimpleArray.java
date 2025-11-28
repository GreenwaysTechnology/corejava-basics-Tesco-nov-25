package com.tesco.datastructure.arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        //iterate
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        double[] prices = {
                13.45, 10.9, 45.8, 90.8
        };
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }
}
