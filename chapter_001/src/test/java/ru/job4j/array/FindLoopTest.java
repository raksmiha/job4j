package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class FindLoopTest for testing class FindLoop.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 16.11.2018
 * @version 1.0
 */
public class FindLoopTest {
	/**
	 * Method whenArrayHasLength5Then0 for correctly testing method indexOf.
	 */@Test
	public void whenArrayHasLength5Then0() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 10, 3};
		int value = 5;
		int result = find.indexOf(input, value);
		int expect = 0;
		assertThat(result, is(expect));
	}

	/**
	 * Method whenArrayHasLength5ThenMinus1 for incorrectly testing method indexOf.
	 */@Test
	public void whenArrayHasLength5ThenMinus1() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 10, 3};
		int value = 6;
		int result = find.indexOf(input, value);
		int expect = -1;
		assertThat(result, is(expect));
	}
}