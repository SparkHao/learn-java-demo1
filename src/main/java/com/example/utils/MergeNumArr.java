package com.example.utils;

public class MergeNumArr {
    public static void main(String[] args) {

    }

    public int[] merge(int[] nums1, int[] nums2, int m, int n){
        if (m == 0) {
            System.arraycopy(nums1, 0, nums2, 0, n);
            return nums1;
        }
        for(int i = 0; i<m-1; i++){
            for(int j=i;j<n;j++){
                if(nums1[i] < nums2[j] && nums1[i+1] > nums2[j]) {
                    System.arraycopy(nums1, i, nums1, j, 1);
                }
            }
        }

        return nums1;
    }
}
