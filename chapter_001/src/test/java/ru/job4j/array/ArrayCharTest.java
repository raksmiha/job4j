package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ArrayCharTest for testing class ArrayTest.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 20.11.2018
 * @version 1.0
 */
public class ArrayCharTest {
	/**
	 * Method whenStartWithPrefixThenTrue for testing method startWith.
	 */ @Test
	public void whenStartWithPrefixThenTrue() {
		ArrayChar word = new ArrayChar("Hello");
		boolean result = word.startWith("He");
		assertThat(result, is(true));
	}
	 
	/**
	 * Method whenStartWithPrefixThenTrue for testing method startWith.
	 */ @Test
	public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}