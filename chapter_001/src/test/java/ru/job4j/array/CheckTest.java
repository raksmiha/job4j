package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class CheckTest.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 18.11.2018
 * @version 1.0
 */

public class CheckTest {
	/**
	 * Method whenDataMonoByTrueThenTrue fot testing method mono.
	 */ @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
	 * Method whenDataNotMonoByTrueThenFalse fot testing method mono.
	 */ @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}