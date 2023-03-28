package com.example.utils;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums){
        for (int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && nums[j] != Integer.MAX_VALUE){
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length ;i++){
            if(nums[i] != Integer.MAX_VALUE) {
                count +=1;
            }
        }

        return count;
    }
}
