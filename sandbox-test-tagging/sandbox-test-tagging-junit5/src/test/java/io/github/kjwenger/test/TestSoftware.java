package io.github.kjwenger.test;

import org.junit.jupiter.api.Test;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.GREEN_TEXT;

public class TestSoftware {
    @Test
    public void testSoftware() {
        System.out.printf(colorize("%s#testSoftware())\n", GREEN_TEXT()),
                getClass().getName()).flush();
    }
}
