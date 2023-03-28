package com.example.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」 定义为：
 *
 *     对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 *     然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 *     如果这个过程 结果为 1，那么这个数就是快乐数。
 *
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * 示例 2：
 *
 * 输入：n = 2
 * 输出：false
 *
 *
 *
 * 提示：
 *
 *     1 <= n <= 231 - 1
 *
 */
public class HappyNum {
    public static void main(String[] args) {
        List<Integer> cycle = new ArrayList<>();
        System.out.println(happyNum(2, cycle));
    }

    public static boolean happyNum(int num, List<Integer>  cycle) {
        if (cycle.contains(num)) {
            return false;
        }else {
            cycle.add(num);
        }
        String numStr = String.valueOf(num);
        char[] chars= numStr.toCharArray();
        int sum = 0;
        for(char c : chars) {
            int a = Integer.parseInt(String.valueOf(c));
            sum += a * a;
        }
        if (sum == 1) {
            return true;
        }else {
            return happyNum(sum, cycle);
        }
    }
}

