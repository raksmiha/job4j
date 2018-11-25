package ru.job4j.array;

/**
 * Class Matrix for wocking with matrix.
 * @author Projhorov Mikhail (gorunovka93@gmail.com)
 * @since 24.11.2018
 * @version 1.0
 */
public class Matrix {
	/**
	 * Method multiple for create multiplication table.
	 * @param size is sides of matrix.
	 * @return table.
	 */
	public int[][] multiple(int size) {
		int[][] table = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		return table;
	}
}