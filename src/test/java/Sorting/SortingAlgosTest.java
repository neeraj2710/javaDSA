package Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgosTest extends SortingAlgos {

    @org.junit.jupiter.api.Test
    void testBubbleSort() {

        assertArrayEquals(SortingAlgos.bubbleSort(new int[]{5,4,1,3,2}),new int[]{1,2,3,4,5});

    }

    @org.junit.jupiter.api.Test
    void testSelectionSort() {

        assertArrayEquals(SortingAlgos.selectionSort(new int[]{5,4,1,3,2}),new int[]{1,2,3,4,5});

    }

    @Test
    void testInsertionSort() {
        assertArrayEquals(SortingAlgos.insertionSort(new int[]{5,4,1,3,2}),new int[]{1,2,3,4,5});
    }

    @Test
    void testCountingSort() {
        assertArrayEquals(SortingAlgos.insertionSort(new int[]{1,4,1,3,2,3,7}),new int[]{1,1,2,3,3,4,7});
    }
}