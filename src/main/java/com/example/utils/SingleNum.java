package com.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNum {
    public static void main(String[] args) {
        System.out.println(singleNum(new int[]{2, 2, 1}));
    }

    public static int singleNum(int[] nums) {
        int num = 0;
        for(int n: nums){
            num ^= n;
        }
        return num;
    }
}
