package com.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author free
 * @Date 2023/3/10 下午3:28
 * @Description TODO
 **/

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 3, 8, 11, 9, 4};
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j ++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
