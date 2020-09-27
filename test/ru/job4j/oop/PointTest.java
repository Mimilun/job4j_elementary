package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenThree() {
        double expected = 2.23;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}