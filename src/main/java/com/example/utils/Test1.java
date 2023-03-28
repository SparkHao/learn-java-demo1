package com.example.utils;

public class Test1 {
    public static void main(String[] args) {
        int a = minMaxDifference(21512);
        System.out.println(a);
    }

    public static int minMaxDifference(int num) {
        String s = String.valueOf(num);
        String a = "", b = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                a = s.replace(s.charAt(i), '9');
                break;
            }
        }
        System.out.println(s + ", a " + a);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                b = s.replace(s.charAt(i), '0');
                break;
            }
        }

        if (!a.equals("") && !b.equals("")) {
            return Integer.parseInt(a) - Integer.parseInt(b);
        }
        return num;
    }
}