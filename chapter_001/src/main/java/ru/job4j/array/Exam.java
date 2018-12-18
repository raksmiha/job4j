package ru.job4j.array;

/**
 * Class Exam for create program for sorting two arrays and create third.
 * @author Prokhorov Mikhail (gorunovka93@yandex.ru)
 * @since 13.12.2018
 * @version 1.0
 */
public class Exam {
	/**
	 * Public method sortArrays sorting first, second arrays and recording it in third array.
	 * @param first, second is our arrays for sorting.
	 * @return thirs is result our sorting.
	 */
	public int[] sortArrays(int[] first, int[] second) {
		int[] third = new int[first.length + second.length];
		int i = 0, j = 0;
		for (int n = 0; n < third.length; n++) {
			if (i >= first.length) {
				third[n] = second[j];
				j++;
			} else if (j >= second.length) {
				third[n] = first[i];
				i++;
			} else if (first[i] < second[j]) {
				third[n] = first[i];
				i++;
			} else {
				third[n] = second[j];
				j++;
			}
		}
		return third;
	}
}