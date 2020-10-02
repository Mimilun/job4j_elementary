package ru.job4j.array;

public class PositiveOrNegative {

    public static boolean check(int[] data) {
        int negative = 0;
        for (int item : data) {
            if (item < 0) {
                negative++;
            }
        }
        return negative % 2 != 0;
    }
}
