package org.farrukh.challenges.algorithms.strings;

import org.junit.Test;

public class CharactersIndexTest {

    @Test
    public void test() {
        int[] tmp1 = new int[26];
        String aWord = "abcdefg";
        for (int i = 0; i < aWord.length(); i++) {
            tmp1[aWord.charAt(i) - 'a']++;
        }
        int[] tmp2 = new int[26];
        String aWord2 = "def";
        int lng = aWord.length() - aWord2.length();
        for (int i = 0; i < lng; i++) {
            for (int j = 0; j < aWord.length(); j++) {
                tmp2[aWord2.charAt(i) - 'a']++;
            }
        }
        System.out.println();

    }
}
