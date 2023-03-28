package com.example.utils;

/**
 * @Author free
 * @Date 2023/3/13 上午10:33
 * @Description TODO
 **/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5, 9, 8 , 7};
        int[] result = bubbleSort(arr);
        for(int n : result) {
            System.out.println(n);
        }
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i=1;i< arr.length; i++) {
            boolean flag = true;
            for (int j=0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        return arr;
    }
}
