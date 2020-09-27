package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax11To11Then11() {
        int result = Max.max(11, 11);
        assertThat(result, is(11));
    }
    @Test
    public void whenMaxTree() {
        int result = Max.max(2, 7, 4);
        assertThat(result, is(7));
    }
    @Test
    public void whenMaxFour() {
        int result = Max.max(3, 6, 5, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenEquals() {
        int result = Max.max(7, 7, 7, 7);
        assertThat(result, is(7));
    }
}