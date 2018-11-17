package ru.job4j.array;

/**
 * Class Turn.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 17.11.2018
 * @version 1.0
 */
public class Turn {
	/**
	 * Method back turning array.
	 * @param array is our array.
	 * @return turning array.
	 */
	public int[] back(int[] array) {
		int end = array.length / 2;
		for (int i = 0; i != end; i++) {
			int j = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = j;
			}
		return array;
	}
	
}