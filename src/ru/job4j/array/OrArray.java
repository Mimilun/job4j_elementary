package ru.job4j.array;

public class OrArray {

    public static int[] or(int[] left, int[] right) {

        int[] arr = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            arr[i] = left[i];
        }
        int index = left.length;
        boolean isArr = true;
        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == arr[j]) {
                    isArr = false;
                    break;
                }
            }
            if (isArr) {
                arr[index] = right[i];
                index++;
            }
            isArr = true;
        }
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
