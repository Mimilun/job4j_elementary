package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {

    @Test
    public void monoTrue() {
        boolean[] data = {true, true, true, true};
        boolean rst = Check.mono(data);
        assertThat(rst, is(true));
    }

    @Test
    public void monoFalse() {
        boolean[] data = {true, false, true, true};
        boolean rst = Check.mono(data);
        assertThat(rst, is(false));
    }
}