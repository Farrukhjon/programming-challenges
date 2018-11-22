package org.farrukh.challenges.data_structure.set;

import java.util.HashSet;
import java.util.Set;

public class PairSumHashSetImpl implements PairSum {

    @Override
    public boolean hashPairWithSum(int[] ints, int sum) {
        Set<Integer> addition = new HashSet<>();
        for (int value : ints) {
            if (addition.contains(value))
                return true;
            int diff = sum - value;
            addition.add(diff);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 4, 8, 8, 4, 3, 5};
        int sum = 12;

        PairSum pairSum = new PairSumHashSetImpl();

        pairSum.hashPairWithSum(ints, sum); // 4 + 8; [3] + [4]

        int[] ints2 = {3, 0, 2, 4};
        int sum2 = 7;
        pairSum.hashPairWithSum(ints2, sum2); // 3 + 4; [0] + [3]
    }

}
