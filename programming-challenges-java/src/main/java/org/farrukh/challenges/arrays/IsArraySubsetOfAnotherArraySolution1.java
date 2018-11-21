package org.farrukh.challenges.arrays;

import java.util.HashSet;

public class IsArraySubsetOfAnotherArraySolution1 implements IsArraySubsetOfAnotherArray {

    @Override
    public boolean isSubset(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        HashSet<Integer> hset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            if (!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsArraySubsetOfAnotherArraySolution1 subsetOfAnotherArraySolution1 = new IsArraySubsetOfAnotherArraySolution1();

        int[] array1 = {0, 3, 4, 1, 2, 5};
        int[] array2 = {0, 1};
        boolean isSubset = subsetOfAnotherArraySolution1.isSubset(array1, array2);
        assert isSubset;

        int[] arr1 = {0, 3, 4, 1, 2, 5};
        int[] arr2 = {10, 15};
        boolean isSubset2 = subsetOfAnotherArraySolution1.isSubset(arr1, arr2);
        assert !isSubset2;

    }

}
