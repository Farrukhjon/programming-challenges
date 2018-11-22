package org.farrukh.challenges.data_structure.linkedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedListByUsingIteratorImpl implements RemoveDuplicatesFromLinkedList {

    @Override
    public void removeDuplicates(LinkedList<Integer> list) {
        HashSet<Integer> container = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (container.contains(value))
                iterator.remove();
            container.add(value);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(0, 2, 4, 7, 7, 6, 9, 3, 2));

        RemoveDuplicatesFromLinkedList duplicatesImpl1 = new RemoveDuplicatesFromLinkedListByUsingIteratorImpl();

        printList(list);

        duplicatesImpl1.removeDuplicates(list);

        printList(list);
    }

    static void printList(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.printf("%s: ", value);
        }
        System.out.println();
    }

}
