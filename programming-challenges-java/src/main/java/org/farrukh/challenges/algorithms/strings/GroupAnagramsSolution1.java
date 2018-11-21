package org.farrukh.challenges.algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsSolution1 implements GroupAnagrams {

    public Collection<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> container = new HashMap<>(words.length);
        char[] charCode = new char[26];
        for (int i = 0; i < words.length; i++) {
            Arrays.fill(charCode, '0');
            char[] chars = words[i].toCharArray();
            for (char c : chars) {
                charCode[c - 'a']++;
            }
            String key = new String(charCode);
            if (!container.containsKey(key))
                container.put(key, new ArrayList<>());
            container.get(key).add(words[i]);
        }
        Collection<List<String>> group = container.values();
        return group;
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagramsSolution1();

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Collection<List<String>> anagrams = groupAnagrams.groupAnagrams(words);

        System.out.println(anagrams);
    }

}
