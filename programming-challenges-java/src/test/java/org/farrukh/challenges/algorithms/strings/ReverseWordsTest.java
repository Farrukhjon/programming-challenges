package org.farrukh.challenges.algorithms.strings;

import org.farrukh.challenges.strings.ReverseWords;
import org.farrukh.challenges.strings.ReverseWordsSolution1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        ReverseWords reverseWordsSolution1 = new ReverseWordsSolution1();

        assertEquals(reverseWordsSolution1.reverseWords("I like eating"), "eating like I");
        assertEquals(reverseWordsSolution1.reverseWords("I like flying"), "flying like I");
        assertEquals(reverseWordsSolution1.reverseWords("The world is nice"), "nice is world The");
    }
}
