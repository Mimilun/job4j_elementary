package ru.job4j.array;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] res = new int[2 + middle.length / 2 + right.length / 2];
        res[0] = left[0];
        res[res.length - 1] = left[left.length - 1];
        for (int i = 1; i < res.length -1; i++) {
            if (i % 2 != 0) {
                res[i] = right[i -1];
            } else {
                res[i] = middle[i -1];
            }
        }

        return res;
    }
}
