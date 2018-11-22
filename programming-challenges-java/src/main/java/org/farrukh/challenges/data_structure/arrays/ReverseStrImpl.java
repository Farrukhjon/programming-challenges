package org.farrukh.challenges.data_structure.arrays;

public class ReverseStrImpl implements ReverseString {

    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int rightIdx = chars.length - 1;
        int leftIdx = 0;
        while (leftIdx < rightIdx) {
            char tmp = chars[leftIdx];
            chars[leftIdx] = chars[rightIdx];
            chars[rightIdx] = tmp;
            leftIdx++;
            rightIdx--;

        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseStrImpl reverser = new ReverseStrImpl();
        String originalStr = "abc";
        String reversedStr = reverser.reverse(originalStr);
        System.out.println(originalStr);
        System.out.println(reversedStr);

        assert reversedStr.equals("cba");
    }
}
