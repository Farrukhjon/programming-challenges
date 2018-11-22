package org.farrukh.challenges.algorithms.strings;

import org.farrukh.challenges.data_structure.strings.Uniqueness;
import org.farrukh.challenges.data_structure.strings.UniquenessSolution1;
import org.junit.Assert;
import org.junit.Test;

public class UniquenessTest {

    @Test
    public void testIsUniqueCharacters() {

        Uniqueness solution1 = new UniquenessSolution1();

        String str = "Language";
        boolean result = solution1.isUniqueCharacters(str);
        Assert.assertFalse(result);

    }
}
