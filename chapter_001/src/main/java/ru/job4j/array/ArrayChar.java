package ru.job4j.array;

/**
 * Class ArrayChar.
 * @author Prokhorov Mikhail (gorunovka93@gmail.com)
 * @since 20.11.2018
 * @version 1.0
 */
public class ArrayChar {
	private char[] data;
	
	public ArrayChar(String line) {
		this.data = line.toCharArray();
	}
	
	/**
	 * Method checking of first part our word.
	 * @param prefix is a part for search.
	 * @return resulr checking.
	 */
	public boolean startWith(String prefix) {
		boolean result = true;
		char[] value = prefix.toCharArray();
		if (String.copyValueOf(this.data).startsWith(String.copyValueOf(value)) == false) {
			result = false;
		}
		return result;
	}
}