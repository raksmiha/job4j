package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class Factorial.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 30.10.2018
 * @version 1.0
 */
public class FactorialTest {
	/**
	 * test method calc.
	 */ @Test
	public void whenFiveThenOneHundredTwenty() {
		Factorial fact = new Factorial();
		int result = fact.calc(5);
		assertThat(result, is(120));
	}

	/**
	 * test method calc.
	 */ @Test
	public void whenZeroThenOne() {
		Factorial fact = new Factorial();
		int result = fact.calc(0);
		assertThat(result, is(1));
	}
}