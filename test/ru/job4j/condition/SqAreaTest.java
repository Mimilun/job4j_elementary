package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square61() {
        int p = 6;
        int k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square27() {
        int p = 10;
        int k = 1;
        double expected = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square39() {
        int p = 23;
        int k = 2;
        double expected = 18;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}