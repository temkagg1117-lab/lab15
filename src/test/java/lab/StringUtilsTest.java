package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void reverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverseSingleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    void reverseAsciiString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void reverseUnicodeString() {
        assertEquals("хайр", StringUtils.reverse("рйах"));
    }
}