package ru.job4j.loop;

/**
 * Class Paint.
 * @author Prohorov Mikhail (gorunovka93@gmail.com)
 * @since 05.11.2018
 * @version 1.0
 */
public class Paint {
	public String piramid(int h) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < h; i++) {
			int emptySpace = h - (i + 1);
			int sybvols = (i + 1) * 2 - 1;
			for (int n = 0; n < emptySpace; n++) {
				screen.append(" ");
			}
			for (int n = 0; n < sybvols; n++) {
				screen.append("^");
			}
			for (int n = 0; n < emptySpace; n++) {
				screen.append(" ");
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}