package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {

        String[] arrStr = new String[s.length()];
        arrStr = s.split("");
        List<String> list = new ArrayList<> (Arrays.asList(arrStr));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        StringBuilder rsl = new StringBuilder();
        for (String l : list) {
            rsl.append(l);
        }
        return rsl.toString();
    }
}
