package org.farrukh.challenges.algorithms.dynamic_programming.subsequence;


public class LCSRecursiveImpl implements LongestCommonSubSequence {

    public static void main(String[] args) {
        String seq1 = "abcd";
        String seq2 = "abcd";

        /**
         *      1 2 3 4
         *       a b c d
         *  1 a  1
         *  2 b    1
         *  3 c       1
         *  4 d         1
         *
         *
         */

        char[] seq1Chs = seq1.toCharArray();
        char[] seq2Chs = seq2.toCharArray();

        int lcs = new LCSRecursiveImpl().lcs(seq1, seq2);

        System.out.printf("LCS: %s", lcs);
    }


    public int lcs(String seq1, String seq2) {

        int m = seq1.length();
        int n = seq2.length();


        return 0;
    }


    public int max(int a, int b) {
        return a > b ? a : b;
    }


}
