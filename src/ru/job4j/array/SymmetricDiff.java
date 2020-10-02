package ru.job4j.array;

public class SymmetricDiff {

    public static int[] diff(int[] left, int[] right) {
        int[] temp = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            temp[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            temp[i + left.length] = right[i];
        }
        int index = temp.length;
        for (int i = 0; i < temp.length; i++) {
            boolean isArr = true;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    temp[j] = 0;
                    isArr = false;
                    index--;
                }
            }
            if (!isArr) {
                temp[i] = 0;
                index--;
            }
        }
        int[] res = new int[index];
        index = 0;
        for (int j : temp) {
            if (j != 0) {
                res[index] = j;
                index++;
            }
        }
        return res;
    }
}
