package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Mikhail Prokhorov (mailto:gorunovka93@gmail.com)
 * @version 1
 * @since 23.09.2018
 */
public class CalculatorTest {
    /**
     *Test method add.
     */ @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     *Test method minus.
     */ @Test
    public void whenMinusTwoAndOneThenOne() {
        Calculator calc = new Calculator();
        calc.minus(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     *Test method div.
     */ @Test
    public void whenDivTwoAndTwoThenOne() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     *Test method multi.
     */ @Test
    public void whenMultiplyTwoAndTwoThenFour() {
        Calculator calc = new Calculator();
        calc.add(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}