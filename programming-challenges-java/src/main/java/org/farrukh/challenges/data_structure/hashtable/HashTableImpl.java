package org.farrukh.challenges.data_structure.hashtable;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    private HashNode[] table;

    private int sizeOfBucket;

    public HashTableImpl(int size) {
        this.table = new HashNode[size];
        for (int i = 0; i < size; i++) {
            table[i] = null;
        }
    }

    @Override
    public int hashFunction() {
        return 0;
    }

    @Override
    public void add(K key, V value) {
        int bucketIndex = findBucketIndex(key);
        HashNode head = table[bucketIndex];
        while (head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
    }

    @Override
    public V getValue(K key) {
        int bucketIndex = findBucketIndex(key);
        HashNode head = table[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return (V) head.value;
            }
            head = head.next;
        }
        return null;
    }

    private class HashNode<K, V> {
        K key;
        V value;

        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    private int findBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % sizeOfBucket;
        return index;
    }

}
