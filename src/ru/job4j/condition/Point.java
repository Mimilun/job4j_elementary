package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int subX = x2 - x1;
        int subY = y2 - y1;
        double powX = Math.pow(subX, 2);
        double powY = Math.pow(subY, 2);
        double sumXY = powX + powY;
        double rsl = Math.sqrt(sumXY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(2, 0, 12, 8);
        System.out.println("result (2, 0) to (12, 8) " + result);

        result = Point.distance(4, 6, 13, 18);
        System.out.println("result (4, 6) to (13, 18) " + result);
    }
}
