package ru.job4j.array;

public class DestroySequence {

    public static char[] destroy(char[] seq) {
        for (int i = 0, j = seq.length - 5; i < 5; i++, j++) {
            seq[i] = '0';
            seq[j] = '1';
        }
        return seq;
    }
}
