package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;
        int i = 0;
        while ((change - COINS[i]) >= 0) {
            rsl[size] = COINS[i];
            change -= COINS[i];
            size++;
            if (change < COINS[i]) {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
