package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Mikhail Prokhorov (mailto:gorunovka93@gmail.com)
* @version 1
* @since 25.07.2018
*/
public class CalculateTest {
	/**
	*Test echo.
	*/ @Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Mikhail Prokhorov";
		String expect = "Echo, echo, echo : Mikhail Prokhorov"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}