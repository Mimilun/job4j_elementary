package ru.job4j.array;

import java.util.Arrays;
public class CheckSumIndexes {

    public static int[] collectNewArray(int[][] data, int sum) {
        int length = 0;
        for (int i = 0; i < data.length; i++) {
            length += data[i].length;
        }
        int[] res = new int[length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    count++;
                    continue;
                }
                res[index++] = data[i][j];
            }
        }
        int[] res2 = new int[length - count];
        res2 = Arrays.copyOf(res, length - count);

        return res2;
    }
}
