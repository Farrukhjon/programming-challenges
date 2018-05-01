package org.farrukh.challenges.algorithms.sorting;

public class Swapper<T extends Comparable> {

    public void swap(T[] array, int i, int j) {
        T tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

}
