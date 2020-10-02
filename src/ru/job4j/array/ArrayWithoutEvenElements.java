package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {

    public static int[] changeData(int[] data) {
        int length = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                continue;
            }
            length++;
        }
        int[] res = new int[length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                continue;
            }
            res[index++] = data[i];
        }

        return res;
    }
}
