package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (list.contains(str)) {
            return false;
        }
        list.add(index, str);
        return !(check.size() == list.size());
    }
}
