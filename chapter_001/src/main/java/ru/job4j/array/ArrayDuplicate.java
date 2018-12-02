package ru.job4j.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate for remove quals elements of array.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 28.11.2018
 * @version 1.0
 */
public class ArrayDuplicate {
	/**
	 * Method remove for finding equals elements and remove duplicates.
	 * @param array is our array.
	 * @return array without duplicates.
	 */
	public String[] remove(String[] array) {
		int checking = 1;
		int endArray = array.length;
		String change;
		for (int i = 0; i < endArray; i++) {
			for (int j = checking; j < endArray; j++) {
				if (array[i].equals(array[j])) {
					change = array[j];
					array[j] = array[endArray - 1];
					array[endArray - 1] = change;
					j--;
					endArray--;
				}
			}
			checking++;
		}
		array = Arrays.copyOf(array, endArray);
		return array;
	}
}