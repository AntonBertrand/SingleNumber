package com.example.mypackage;

import java.util.ArrayList;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

public class Main {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (duplicates.contains(nums[i])) {
                continue;
            }

            int count = 0;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    duplicates.add(nums[i]);
                    count++;
                }
            }

            if (count == 0) {
                return nums[i];
            }

        }

        return -1;
    }

}
