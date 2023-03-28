package com.example.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author free
 * @Date 2023/3/14 下午8:55
 * @Description TODO
 **/

public class Majority {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }

    public static int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.getOrDefault(num, 0) > nums.length / 2) {
                idx = num;
                break;
            }
        }
        return idx;
    }
}
