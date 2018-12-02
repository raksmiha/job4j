package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ArrayDuplicateTest for testing class ArrayDuplicate.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 29.11.2018
 * @version 1.0
 */
public class ArrayDuplicateTest {
	/**
	 * Method for testing method remove.
	 */ @Test
	public void whenArrayWithDuplicatesThenArreyWithoutDuplicates() {
		ArrayDuplicate array = new ArrayDuplicate();
		String[] expectArray = {"Привет", "Мир", "Супер"};
		String[] resultArray = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		resultArray = array.remove(resultArray);
		assertThat(resultArray, is(expectArray));
	}
}