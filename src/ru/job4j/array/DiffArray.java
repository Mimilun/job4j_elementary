package ru.job4j.array;

public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int[] temp = new int[left.length + right.length];
        boolean isRight = true;
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                temp[index] = left[i];
                index++;
            }
            isRight = true;
        }
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            res[i] = temp[i];
        }
        return res;
    }
}
