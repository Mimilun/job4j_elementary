package ru.job4j.array;

public class Decoding {

    public static int[] decode(int[] ints, int number) {
        int[] res = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            res[i] = ints[i] % number;
        }

        return res;
    }
}
