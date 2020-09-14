package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(9, 7, 4);
        assertThat(result, is(9));
    }
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(5, 7, 4);
        assertThat(result, is(7));
    }
    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(3, 7, 14);
        assertThat(result, is(14));
    }
    @Test
    public void whenAllMax() {
        int result = MultiMax.max(7, 7, 7);
        assertThat(result, is(7));
    }
}