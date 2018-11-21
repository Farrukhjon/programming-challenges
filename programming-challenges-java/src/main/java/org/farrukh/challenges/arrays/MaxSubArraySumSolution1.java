package org.farrukh.challenges.arrays;

import static org.farrukh.challenges.math_basic.Utils.max;

public class MaxSubArraySumSolution1 implements MaxSubArraySum {

    /**
     * O(n^3) - three nested loops.
     */
    @Override
    public int maxSumOfSubArray(int[] array) {
        int length = array.length;
        int best = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                best = max(best, sum);
            }
        }
        return best;
    }

}
