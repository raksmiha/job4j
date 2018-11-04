package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test class Board.
* @author Mikhail Prokhorov (gorunovka93@gmail.com)
* @version 1.0
* @since 04.11.2018
*/
public class BoardTest {
	@Test
	public void whenWidthThreeAndHieghtThree() {
		Board board = new Board();
		String rs1 = board.paint(3, 3);
		String ln = System.lineSeparator();
		assertThat(rs1, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
	}
	
	@Test
	public void whenWidthFiveAndHieghtFour() {
		Board board = new Board();
		String rs1 = board.paint(5, 4);
		String ln = System.lineSeparator();
		assertThat(rs1, is(String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)));
	}
}