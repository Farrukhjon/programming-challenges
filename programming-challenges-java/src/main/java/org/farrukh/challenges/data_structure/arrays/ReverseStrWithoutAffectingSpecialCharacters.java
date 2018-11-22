package org.farrukh.challenges.data_structure.arrays;

public class ReverseStrWithoutAffectingSpecialCharacters implements ReverseString {

    public String reverse(String str) {

        char[] chars = str.toCharArray();

        int rightIdx = chars.length - 1;
        int leftIdx = 0;

        while (leftIdx < rightIdx) {
            if (!Character.isAlphabetic(chars[leftIdx]))
                leftIdx++;
            if (!Character.isAlphabetic(chars[rightIdx]))
                rightIdx++;
            else {
                char tmp = chars[leftIdx];
                chars[leftIdx] = chars[rightIdx];
                chars[rightIdx] = tmp;
                leftIdx++;
                rightIdx--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseStrWithoutAffectingSpecialCharacters reverser = new ReverseStrWithoutAffectingSpecialCharacters();

        String originalStr = "abcd$ef#jg???ij";

        String reversedStr = reverser.reverse(originalStr);

        System.out.println(originalStr);
        System.out.println(reversedStr);


    }


}
