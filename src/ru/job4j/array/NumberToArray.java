package ru.job4j.array;

public class NumberToArray {

    public static int[] resolve(int number) {
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = number % 10;
            number /= 10;
        }

        return res;
    }
}
