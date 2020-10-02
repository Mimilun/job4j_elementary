package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {

        int[] res = new int[left.length * left[0].length];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                if (left[i][j] > right[i][j]) {
                    res[index++] = left[i][j];
                } else {
                    res[index++] = right[i][j];
                }
            }
        }
        return res;
    }
}
