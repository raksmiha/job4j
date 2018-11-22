package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class BubbleSortTest for testing class BubbleSort.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 22.11.2018
 * @version 1.0
 */
public class BubbleSortTest {
	/**
	 * Method whenGiveArrayReceiveSortArray for tasting method sort.
	 */ @Test
	public void whenGiveArrayReceiveSortArray() {
		BubbleSort bubbles = new BubbleSort();
		int[] resultArray = {5, 1, 2, 7, 3};
		resultArray = bubbles.sort(resultArray);
		int[] expectArray = {1, 2, 3, 5, 7};
		assertThat(resultArray, is(expectArray));
	}
}