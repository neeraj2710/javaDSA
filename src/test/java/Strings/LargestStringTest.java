package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestStringTest extends LargestString {

    @Test
    void testLongestString() {
        assertEquals(LargestString.longestString(new String[]{"apple","mango","banana"}),"mango");
    }
}