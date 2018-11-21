package org.farrukh.challenges.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSubArraySumTest {

    @Test
    public void testMaxSubArraySumSolution1() {
        MaxSubArraySum solution1 = new MaxSubArraySumSolution1();

        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        int maxSum = solution1.maxSumOfSubArray(ints);

        int expected = 11;
        assertEquals(expected, maxSum);

    }

    @Test
    public void testMaxSubArraySumSolution2() {
        MaxSubArraySum solution2 = new MaxSubArraySumSolution2();

        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        int maxSum = solution2.maxSumOfSubArray(ints);

        int expected = 11;
        assertEquals(expected, maxSum);

    }

    @Test
    public void testMaxSubArraySumSolution3() {
        MaxSubArraySum solution3 = new MaxSubArraySumSolution3();

        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        int maxSum = solution3.maxSumOfSubArray(ints);

        int expected = 11;
        assertEquals(expected, maxSum);

    }

}
