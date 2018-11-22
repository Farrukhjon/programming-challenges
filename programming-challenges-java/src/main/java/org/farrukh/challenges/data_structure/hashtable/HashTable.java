package org.farrukh.challenges.data_structure.hashtable;

public interface HashTable<K, V> {

    int hashFunction();

    void add(K key, V value);

    V getValue(K key);

}
