package io.github.kjwenger.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.RED_TEXT;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("HardwareTest")
public class TestHardware {
    @Test
    public void testHardware() {
        System.out.printf(colorize("%s#testHardware())\n", RED_TEXT()),
                getClass().getName()).flush();
        assertEquals("HardwareTest", System.getProperty("test.profile"));
    }
}
