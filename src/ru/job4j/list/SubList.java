package ru.job4j.list;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int start = list.indexOf(el);
        int end = list.lastIndexOf(el);
        if (start != end) {
            list.retainAll(list.subList(start, end));
        } else {
            list.clear();
        }
        return list;
    }
}
