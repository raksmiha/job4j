package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Class PintTest.
 * @author Prohorov Mikhail (gorunovka93@gmail.com)
 * @since 05.11.2018
 * @version 1.0
 */
public class PaintTest {
    @Test
    public void whenPyramidHieghtFour() {
        Paint paint = new Paint();
        String rst = paint.piramid(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator()).add("   ^   ").add("  ^^^  ").add(" ^^^^^ ").add("^^^^^^^").toString()));
    }
}