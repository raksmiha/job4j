package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SquareTest
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 13.11.2018
 * @version 1.0
 */
public class SquareTest {
    /**
     * Method whenBound3Then149 for testing mothed calculate
     */ @Test
	public void whenBound3Then149() {
		int bound = 3;
		Square square = new Square();
		int[] rst = square.calculate(bound);
		int[] expect = new int[] {1, 4, 9};
		assertThat(rst, is(expect));
	}
}