package com.example.utils;

/**
 * @Author free
 * @Date 2023/3/15 上午11:26
 * @Description TODO
 **/

public class FindNthDigit {
    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }

    public static int findNthDigit(int n) {
        String data = "0123456789101112131415";
        char[] arr = data.toCharArray();
        return Integer.parseInt(String.valueOf(arr[n%data.length()]));
    }
}
