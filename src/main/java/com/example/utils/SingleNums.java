package com.example.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNums {
    public static void main(String[] args) {
        System.out.println(singleNums(new int[]{2, 2, 1}));
    }

    public static int[] singleNums(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int n: nums) {
           result.put(n, result.getOrDefault(n, 0) + 1);
        }

        int index = 0;
        int[] res = new int[2];
        for(int i: nums) {
            if (result.get(i) == 1) {
                res[index++] = i;
            }
        }
        return res;
    }
}
