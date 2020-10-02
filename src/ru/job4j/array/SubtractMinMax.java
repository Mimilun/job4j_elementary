package ru.job4j.array;

public class SubtractMinMax {

    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int item : ints) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }

        return max - min;
    }
}
