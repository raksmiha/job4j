package ru.job4j.array;

/**
 * Class BubbleSort for sorting array.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 22.11.2018
 * @version 1.0
 */
public class BubbleSort {
	/**
	 * Method sort for sorting.
	 * @param array is our array.
	 * @return sorted array.
	 */
	public int[] sort(int[] array) {
		int lengthArray = array.length;
		int change;
		for (int i = 1; i < lengthArray; i++) {
			for (int j = 1; j < lengthArray; j++) {
				if (array[j - 1] > array[j]) {
					change = array[j];
					array[j] = array[j - 1];
					array[j - 1] = change;
				}
			}
		}
	}
}