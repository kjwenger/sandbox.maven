package io.github.kjwenger.test;

import io.github.kjwenger.category.HardwareTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.RED_TEXT;
import static junit.framework.TestCase.assertEquals;

@Category(HardwareTest.class)
public class TestHardware {
    @Test
    public void testHardware() {
        System.out.printf(colorize("%s#testHardware())\n", RED_TEXT()),
                getClass().getName()).flush();
        assertEquals("HardwareTest", System.getProperty("test.profile"));
    }
}
