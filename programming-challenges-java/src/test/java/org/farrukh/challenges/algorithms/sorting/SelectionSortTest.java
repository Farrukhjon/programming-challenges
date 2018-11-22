package org.farrukh.challenges.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSelectionSortSolution1() {
        SelectionSort<String> selectionSortSolution1 = new SelectionSortSolution1<>();

        String[] array = {"D", "A", "C", "B"};

        selectionSortSolution1.sort(array);

        String[] sortedStrArray = {"A", "B", "C", "D"};
        assertArrayEquals(sortedStrArray, array);

        SelectionSort<Integer> intSelectionSortSolution1 = new SelectionSortSolution1<>();
        Integer[] ints = {0, 9, 3, 7, 8, 5, 4, 2, 1, 6};

        Integer[] sortedInts = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        intSelectionSortSolution1.sort(ints);

        assertArrayEquals(sortedInts, ints);
    }
}
