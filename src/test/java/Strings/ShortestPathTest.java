package Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathTest extends ShortestPath {

    @Test
    void testShortestPath() {
        assertEquals(ShortestPath.shortestPath("WNEENESENNN"),(double)5);
    }
}