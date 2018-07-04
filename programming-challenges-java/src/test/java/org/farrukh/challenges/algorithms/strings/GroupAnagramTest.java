package org.farrukh.challenges.algorithms.strings;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupAnagramTest {

    private GroupAnagramSolution1 sut;

    @Before
    public void setUp() throws Exception {
        sut = new GroupAnagramSolution1();
    }

    @Test
    public void testGroupingAnagram() {
        String[] words = {"cat", "act", "book", "koob", "Aziza"};
        Set<List> groupedAnagrams = sut.groupAnagram(words);

        Set<List> expectedAGroup = createExpectedAnagramGroup();
    }

    private Set<List> createExpectedAnagramGroup() {
        HashSet<List> group = new HashSet<>();
        group.add(Arrays.asList("cat", "act"));
        group.add(Arrays.asList("book", "koob"));
        group.add(Arrays.asList("Aziza"));
        return group;
    }
}
