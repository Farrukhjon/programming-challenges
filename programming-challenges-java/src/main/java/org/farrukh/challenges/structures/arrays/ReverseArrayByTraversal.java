package org.farrukh.challenges.structures.arrays;

public class ReverseArrayByTraversal {

    public static void main(String[] args) {
        ReverseArrayByTraversal reverseArray = new ReverseArrayByTraversal();

        int[] ints = {0, 3, 1, 4, 6, 8, 7, 9};

        printArray(ints);

        reverseArray.reverse(ints);

        printArray(ints);
    }

    private void reverse(int[] ints) {
        int low = 0;
        int high = ints.length - 1;
        while (low < high) {
            int tmp = ints[low];
            ints[low] = ints[high];
            ints[high] = tmp;
            low++;
            high--;
        }
    }

    private static void printArray(int[] ints) {
        for (int value : ints) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }

}
