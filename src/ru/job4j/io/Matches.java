package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int countMatch = 11;
        boolean player = true;
        String str = "";
        int select = 0;
        Scanner input = new Scanner(System.in);
        while (countMatch > 0) {
            str = player ? "Первый" : "Второй";
            System.out.println(str + " игрок возьмите спичек от 1 до 3-х ");
            player = !player;
            select = Integer.parseInt(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("!!! От 1 до 3-х");
                select = Integer.parseInt(input.nextLine());
            }
            countMatch -= select;
            countMatch = Math.max(countMatch, 0);
            System.out.println("На столе осталось " + countMatch + " спичек");
        }
        System.out.println("\n" + str + " игрок победил!!!");
    }
}