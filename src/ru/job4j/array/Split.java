package ru.job4j.array;

import java.util.Arrays;

public class Split {

    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 0;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            char[] add = new char[str.length];
            while (i < str.length && str[i] != c) {
                add[count] = str[i];
                i++;
                count++;
            }
            result[commonCount] = Arrays.copyOf(add, count);
            commonCount++;
        }

        return Arrays.copyOf(result, commonCount);
    }
}
