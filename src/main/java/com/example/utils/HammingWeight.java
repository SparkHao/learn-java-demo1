package com.example.utils;

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
        System.out.println(hammingWeight(-3));
    }

    public static int hammingWeight(int n) {
        int count = 0;
//        String s = Integer.toBinaryString(n);
//        for(int i=0;i<s.length();i++){
//            if (s.charAt(i) == '1'){
//                count = count + 1;
//            }
//        }

//        while (n != 0){
//            if ((n & 1) == 1){
//                count += 1;
//            }
//            n >>= 1;
//        }

        System.out.println();
        return count;
    }
}
