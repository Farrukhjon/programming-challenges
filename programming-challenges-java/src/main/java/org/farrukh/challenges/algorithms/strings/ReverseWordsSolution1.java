package org.farrukh.challenges.algorithms.strings;

public class ReverseWordsSolution1 implements ReverseWords {

    @Override
    public String reverseWords(String str) {
        StringBuilder reversedSentence = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence
                    .append(words[i])
                    .append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
