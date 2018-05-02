package org.farrukh.challenges.structures.arrays;

import static org.farrukh.challenges.algorithms.Utils.max;

public class MaxSubArraySumSolution3 implements MaxSubArraySum {

    /**
     * O(n^1 = n) - one loop solution.
     */
    @Override
    public int maxSumOfSubArray(int[] array) {
        int length = array.length;
        int best = 0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = max(array[i], sum + array[i]);
            best = max(best, sum);
        }
        return best;
    }

}
