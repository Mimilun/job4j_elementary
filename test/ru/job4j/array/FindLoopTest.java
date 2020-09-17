package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then3() {
        int[] input = {3, 9, 1, 8, 5, 3, 7, 9};
        int result = FindLoop.indexOf(input, 8);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas9Then1() {
        int[] input = {3, 9, 1, 8, 5, 3, 7, 9};
        int result = FindLoop.indexOf(input, 9);
        int expect = 4;
        assertThat(result, is(expect));
    }
}