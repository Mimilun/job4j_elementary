package ru.job4j.array;

public class SumWithStopEl {

    public static int count(int[] data, int el) {
        int sum = 0;
        int i = 0;
        while (data[i] != el && i < data.length - 1) {
            sum += data[i];
            i++;
        }
        if (sum % 2 == 0) {
            return sum;
        }

        return 0;
    }
}
