package ru.job4j.array;

/**
 * Class MatrixCheck for checking main diagonal of matrix.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 25.11.2018
 * @version 1.0
 */
public class MatrixCheck {
	/**
	 * Method mono for checking that main diagonal is equal.
	 * @param data array for checking.
	 * @return result our checking.
	 */
	public boolean mono(boolean[][] data) {
		boolean result = true;
		mainLoop:
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (i == j) {
					if (data[i][j] != data[0][0]) {
						result = false;
						break mainLoop;
					}
				}
			}
		}
		return result;
	}
}