package org.farrukh.challenges.algorithms.strings;

import org.farrukh.challenges.data_structure.strings.GroupAnagramsSolution1;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupAnagramsTest {

    private GroupAnagramsSolution1 sut;

    @Before
    public void setUp() throws Exception {
        sut = new GroupAnagramsSolution1();
    }

    @Test
    public void testGroupingAnagram() {
        String[] words = {"cat", "act", "book", "koob", "Aziza"};
        Collection<List<String>> groupedAnagrams = sut.groupAnagrams(words);

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
