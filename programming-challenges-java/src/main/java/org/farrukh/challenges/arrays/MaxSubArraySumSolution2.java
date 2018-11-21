package org.farrukh.challenges.arrays;

import static org.farrukh.challenges.math_basic.Utils.max;

public class MaxSubArraySumSolution2 implements MaxSubArraySum {

    /**
     * O(n^2) by two nested loops.
     */
    @Override
    public int maxSumOfSubArray(int[] array) {
        int length = array.length;
        int best = 0;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += array[j];
                best = max(best, sum);
            }
        }
        return best;

    }
}
