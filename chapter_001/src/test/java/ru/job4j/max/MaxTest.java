package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class MaxTest for testing maximum two numbers.
 * @author Prokhorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 13.10.2018
 * @version $Id$
 */
public class MaxTest {
	/**
	* Test method max.
	*/ @Test
	public void whenOneLessTwoThenTwo() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
}
