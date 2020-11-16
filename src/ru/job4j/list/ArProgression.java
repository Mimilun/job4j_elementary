package ru.job4j.list;

import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        for (int i = 1; i < data.size() - 1; i++) {
            if ((data.get(i - 1) + data.get(i + 1)) / 2 != data.get(i)) {
                return 0;
            }
        }
        for (Integer i : data) {
            sum += i;
        }
        return sum;
    }
}
