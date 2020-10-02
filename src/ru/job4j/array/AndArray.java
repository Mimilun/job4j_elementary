package ru.job4j.array;
import java.util.Arrays;

public class AndArray {

    public static int[] and(int[] left, int[] right) {
        int[] temp = new int[left.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    temp[count] = left[i];
                    count++;
                }
            }
        }
        int[] res = new int[count];
        res = Arrays.copyOf(temp, count);

        return res;
    }
}
