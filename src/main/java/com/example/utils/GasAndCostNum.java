package com.example.utils;

public class GasAndCostNum {
    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
//        int[] gas = new int[]{2, 3, 4};
//        int[] cost = new int[]{3, 4, 3};
        System.out.println(gasAndCost(gas, cost));
    }

    public static int gasAndCost(int[] gas, int[] cost) {
        if (gas.length == 0 || cost.length == 0) {
            return -1;
        }
        int index = -1;
        int cur_gas = 0;
        int n = gas.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < gas.length; i++) {
            cur_gas = cur_gas + gas[i] - cost[i];
            if (cur_gas < min) {
                index = i;
                min = cur_gas;
            }
        }
        return cur_gas >= 0 ? (index + 1) % n : -1;
    }
}
