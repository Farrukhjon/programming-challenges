package org.farrukh.challenges.structures.arrays;

public class MaxSubArraySumSolution1 implements MaxSubArraySum {

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

    private int max(int best, int sum) {
        return best >= sum ? best : sum;
    }

}
