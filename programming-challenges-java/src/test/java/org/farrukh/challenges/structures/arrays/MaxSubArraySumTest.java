package org.farrukh.challenges.structures.arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArraySumTest {

    @Test
    public void testMaxSubArraySumSolution1() {
        MaxSubArraySum solution1 = new MaxSubArraySumSolution1();

        int[] ints = {0, 1, 2, 3, 5, -1, -5, 6, -4, -2};

        int maxSum = solution1.maxSumOfSubArray(ints);

        int expected = 11;
        Assert.assertEquals(expected, maxSum);

    }
}
