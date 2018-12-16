package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ExamTest for testing class Exam.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 13.12.2018
 * @version 1.0
 */
public class ExamTest {
	/**
	 * Method for testing method sortArrays.
	 */ @Test
	public void whenTwoArraysSortingFirstArraySmallerThenArray() {
		Exam array = new Exam();
		int[] first = {1, 3, 4, 4, 4};
		int[] second = {2, 4, 4, 4, 8, 9};
		int[] expectArray = {1, 2, 3, 4, 4, 4, 4, 4, 4, 8, 9};
		int resultArray[] = array.sortArrays(first, second);
		assertThat(resultArray, is(expectArray));
	}

	/**
	 * Method for testing method sortArrays.
	 */ @Test
	public void whenTwoArraysSortingSecondArraySmallerThenArray() {
		Exam array = new Exam();
		int[] first = {1, 3, 4, 4, 4, 8, 9};
		int[] second = {2, 4, 4, 4};
		int[] expectArray = {1, 2, 3, 4, 4, 4, 4, 4, 4, 8, 9};
		int resultArray[] = array.sortArrays(first, second);
		assertThat(resultArray, is(expectArray));
	}
}