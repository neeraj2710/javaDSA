package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTest extends Capitalize {

    @Test
    void testTransform() {
        assertEquals("Capitalize", transform("capitalize"));
    }

}