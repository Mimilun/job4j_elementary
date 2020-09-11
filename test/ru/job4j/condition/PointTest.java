package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when212to08then2() {
        double expected = 12.8;
        int x1 = 2;
        int x2 = 12;
        int y1 = 0;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when413to618then2() {
        int expected = 15;
        int x1 = 4;
        int x2 = 13;
        int y1 = 6;
        int y2 = 18;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when211to1225then2() {
        double expected = 15.81;
        int x1 = 2;
        int x2 = 11;
        int y1 = 12;
        int y2 = 25;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}