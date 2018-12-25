package ru.job4j.loop;

/**
 * Class Board.
 * @author Prohorov Mikhail (mailto:gorunovka93@gmail.com)
 * @since 25.10.2018
 * @version 1.0
 */
public class Board {
	/**
	 * Method paint array of X and space.
	 * @param width of array.
	 * @param height of array.
	 * @return sum.
	 */
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					screen.append("X");
				} else {
					screen.append(" ");
				}
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}
