package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then58() {
        int a = 10, b = 9, c = 0, x = 2;
        int out = X2.calc(a, b, c, x);
        int expected = 58;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1, b = 1, c = 1, x = 1;
        int out = X2.calc(a, b, c, x);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0, b = 1, c = 1, x = 1;
        int out = X2.calc(a, b, c, x);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1, b = 1, c = 0, x = 1;
        int out = X2.calc(a, b, c, x);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1, b = 1, c = 1, x = 0;
        int out = X2.calc(a, b, c, x);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}