package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int countMatch = 11;
        boolean player = true;
        int select = 0;
        Scanner input = new Scanner(System.in);
        while (countMatch > 0) {
            String str = player ? "Первый" : "Второй";
            System.out.println(str + " игрок возьмите спичек от 1 до 3-х ");
            player = !player;
            select = Integer.valueOf(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("!!! От 1 до 3-х");
                select = Integer.valueOf(input.nextLine());
            }
            countMatch -= select;
            countMatch = countMatch < 0 ? 0 : countMatch;
            System.out.println("На столе осталось " + countMatch + " спичек");
        }
    }
}
