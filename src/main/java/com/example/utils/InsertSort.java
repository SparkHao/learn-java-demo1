package com.example.utils;

/**
 * @Author free
 * @Date 2023/3/13 上午9:31
 * @Description TODO
 **/

public class InsertSort {
    public static void main(String[] args) {
        int[] ar = {1, 4, 2, 6, 5, 9, 8 , 7};
        int[] res = insertSort(ar, ar.length);
        for (int n: res) {
            System.out.print(n);
        }
        System.out.println();
    }

    public static int[] insertSort(int[] a, int n ){
        if (n <= 1) {
            return a;
        }

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }
        return a;
    }
}
