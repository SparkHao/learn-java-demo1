package com.example.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author free
 * @Date 2023/3/10 下午2:17
 * @Description TODO
 **/

public class IterExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("add");

        list.removeIf(s -> s.contains("a"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("a")) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }

}
