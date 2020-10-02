package ru.job4j.array;

public class Divider {

    public static boolean check(int num, int[] ints) {
        for (int item : ints) {
            if (num % item != 0) {
                return false;
            }
        }

        return true;
    }
}
