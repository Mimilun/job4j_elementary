package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int length = array.length / 2;
        while (length * length > array.length) {
            length--;
        }
        int[][] res = new int[length + 1][length + 1];
        int index = 0;
        for (int i = 0; i < length + 1; i++) {
            for (int j = 0; j < length + 1; j++) {
                if (index < array.length) {
                    res[i][j] = array[index++];
                } else {
                    res[i][j] = 0;

                }
            }
        }
        return res;
    }
}
