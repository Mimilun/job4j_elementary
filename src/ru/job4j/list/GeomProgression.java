package ru.job4j.list;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = 0;

        while (count > 0) {
            sum += first;
            first *= denominator;
            count--;
        }

        return sum;
    }
}
