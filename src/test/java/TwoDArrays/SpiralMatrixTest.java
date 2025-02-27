package TwoDArrays;

import Sorting.SortingAlgos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest extends SortingAlgos {

    @Test
    void spiral() {
        int[][] a = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        int[] b = {1,2,3,6,9,8,7,4,5};

        assertArrayEquals(b, SpiralMatrix.spiral(a));
    }
}