package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Mikhail Prokhorov (mailto:gorunovka93@gmail.com)
 * @version 1
 * @since 26.10.2018
 */
public class CounterTest {
	/**
	 * test method add.
	 */ @Test
	public void whenSunEvenNumbersFromOneToTenThenThirty() {
		Counter count = new Counter();
		int result = count.add(1, 10);
		assertThat(result, is(30));
	}
}