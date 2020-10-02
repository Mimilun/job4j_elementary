package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int countMatch = 11;
        Scanner input = new Scanner(System.in);
        while (countMatch > 0) {
            for (int i = 1; i <= 2 || countMatch > 0; i++) {
                System.out.println("Игрок " + i + " возьмите спичек от 1 до 3-х ");
                int select = Integer.valueOf(input.nextLine());
                countMatch -= select;
                System.out.println("На столе осталось " + countMatch + " спичек");
            }
        }
    }
}
