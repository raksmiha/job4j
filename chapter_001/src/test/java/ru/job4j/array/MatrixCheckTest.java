package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MatrixCheckTest for testing class MatrixCheck
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since  25.11.2018
 * @version 1.0
 */

public class MatrixCheckTest {
	/**
	 * Method whenDataMonoByTrueThenTrue for checking method
	 mono when main diagonal is quals and array is odd.
	 */	@Test
	public void whenDataMonoByTrueThenTrueArrayOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false, true},
                {false, true, false},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

	/**
	 * Method whenDataMonoByTrueThenTrue for checking method
	 mono when main diagonal is not quals and array is odd.
	 */ @Test
    public void whenDataNotMonoByTrueThenFalseArrayOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
	
	/**
	 * Method whenDataMonoByTrueThenTrue for checking method
	 mono when main diagonal is quals and array is even.
	 */	@Test
	public void whenDataMonoByTrueThenTrueArrayEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false, false, false},
                {false, true, false, false},
                {false, false, true, false},
                {false, false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

	/**
	 * Method whenDataMonoByTrueThenTrue for checking method
	 mono when main diagonal is not quals and array is even.
	 */ @Test
    public void whenDataNotMonoByTrueThenFalseArrayEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, true},
                {true, true, false, true},
                {true, true, true, true},
				{true, true, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
