package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {

        int length = 0;
        for (int i = 0; i < array.length; i++) {
            length += array[i].length;
        }
        int[] fullArr = new int[length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                fullArr[index++] = array[i][j];
            }
        }

        int halfLength = length / 2;
        while (halfLength * halfLength >= length) {
            halfLength--;
        }
        halfLength++;
        index = 0;
        int[][] res = new int[halfLength][halfLength];
        for (int i = 0; i < halfLength; i++) {
            for (int j = 0; j < halfLength; j++) {
                if (index < length) {
                    res[i][j] = fullArr[index++];
                } else {
                    res[i][j] = 0;
                }
            }
        }
        return res;
    }
}
