package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void back6() {
        int[] data = {1, 2, 3, 4, 5, 6};
        int[] rst = Turn.back(data);
        int[] expect = {6, 5, 4, 3, 2, 1};
        assertThat(expect, is(rst));
    }

    @Test
    public void back5() {
        int[] data = {1, 2, 3, 4, 5};
        int[] rst = Turn.back(data);
        int[] expect = {5, 4, 3, 2, 1};
        assertThat(rst, is(expect));
    }
}