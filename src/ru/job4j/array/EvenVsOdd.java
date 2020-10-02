package ru.job4j.array;

public class EvenVsOdd {

    public static int whoWin(int[] players) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum1 += players[i];
            } else {
                sum2 += players[i];
            }
        }
        int win = 0;
        if (sum1 > sum2) {
            win = 1;
        }
        if (sum1 < sum2) {
            win = 2;
        }
        return win;
    }
}
