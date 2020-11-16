package ru.job4j.list;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {


    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);
    }
}
