package org.farrukh.challenges.data_structure.lists;

public class LinkedList {

    private Node firstNode;
    private Node lastNode;

    private int size;

    public void addFirst(Object item) {
        Node next = firstNode;
        Node newNode = new Node(item, null, next);
        if (next == null)
            lastNode = newNode;
        else
            next.previous = newNode;
        size++;
    }

    private static class Node {
        private final Object item;
        private Node next;
        private Node previous;

        public Node(Object item, Node previous, Node next) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

}
