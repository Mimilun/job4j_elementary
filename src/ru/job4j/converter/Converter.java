package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int out = Converter.rubleToEuro(in);
        int expected = 2;
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
