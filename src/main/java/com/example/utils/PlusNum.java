package com.example.utils;

public class PlusNum {
    public static void main(String[] args) {
        System.out.println(plus(5, 3));
    }

    public static int plus(int a, int b) {
        int e = a ^ b;
        int p = (a & b) << 1;
        while (p != 0) {
            a = e;
            b = p;
            e = a ^ b;
            p = (a & b) << 1;
        }
        return e;
    }
}
/**
 * 给你两个整数 a 和 b ，不使用 运算符 + 和 -，计算并返回两整数之和。
 *
 * 示例 1：
 *
 * 输入：a = 1, b = 2
 * 输出：3
 *
 * 示例 2：
 *
 * 输入：a = 2, b = 3
 * 输出：5
 */
