package org.farrukh.challenges.algorithms.strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupAnagramSolution1 implements GroupAnagram {

    public Set<List> groupAnagram(String[] words) {

        for (String word : words) {
            System.out.printf("\nhashCode of %s, %s", word, word.hashCode());
        }

        HashSet<List> resultGroup = new HashSet<>();
        return resultGroup;
    }

    class Word {

    }
}
