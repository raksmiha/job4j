package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MatrixTest for twsting class Matrix.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 24.11.2018
 * @version 1.0
 */
public class MatrixTest {
	/**
	 * Method when2on2 for testing method multiple.
	 */ @Test
	public void when2on2() {
		Matrix matrix = new Matrix();
		int[][] table = matrix.multiple(2);
		int[][] expect = {{1, 2}, {2, 4}};
		assertThat(table, is(expect));
	}
}
	 