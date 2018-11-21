package org.farrukh.challenges.hashtable;

public interface HashTable<K, V> {

    int hashFunction();

    void add(K key, V value);

    V getValue(K key);

}
