package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest extends Palindrome {

    @Test
    void testIsPalindrome() {
        assertTrue(isPalindrome("racecar"));
        assertFalse(isPalindrome("abc"));
    }
}