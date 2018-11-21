package org.farrukh.challenges.dp.subsequence;


/**
 *  A subsequence is a sequence that can be derived from another sequence
 *  by deleting some elements without changing the order of the remaining elements.
 *
 */
public interface LongestCommonSubSequence {

    /**
     * Longest common subsequence (LCS) of 2 sequences is a subsequence, with maximal length,
     * which is common to both the sequences.
     * @param seq1
     * @param seq2
     * @return
     */
    int lcs(String seq1, String seq2);

}
