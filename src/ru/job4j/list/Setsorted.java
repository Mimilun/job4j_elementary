package ru.job4j.list;

import java.util.*;

public class Setsorted {
    public static void main(String[] args) {
        NavigableSet<Integer> sortset = new TreeSet<>();

        sortset.add(3);
        sortset.add(1);
        sortset.add(4);
        sortset.add(2);
        sortset.add(5);
        System.out.println(sortset);
        System.out.println(getNextEl(sortset, 4));
        System.out.println(getPrevEl(sortset, 2));


    }
    public static int getNextEl(NavigableSet set, Integer el) {
        return (int)set.higher(el);
    }
    public static int getPrevEl(NavigableSet set, Integer el) {
        return (int)set.lower(el);
    }
}
