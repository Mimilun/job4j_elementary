package ru.job4j.array;

public class MaxLengthSeria {

    public static int find(int[] array) {
        int res = 1;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (res < count) {
                res = count;
            }
        }
        return res;
    }
}
