package ru.job4j.array;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int[] res = new int[data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
                res[index++] = data[i][data.length - i - 1];
        }
        return res;
    }
}
