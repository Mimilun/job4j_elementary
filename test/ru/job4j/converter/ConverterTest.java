package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int out = Converter.rubleToEuro(in);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int out = Converter.rubleToDollar(in);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }
}