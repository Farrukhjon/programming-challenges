package org.farrukh.challenges.strings;

public class PalindromeIterativeImpl implements Palindrome {

    @Override
    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty())
            return false;
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            char charFirs = str.charAt(low);
            char charLast = str.charAt(high);
            if (charFirs != charLast)
                return false;
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new PalindromeIterativeImpl();

        String str1 = "aziza";
        boolean isPalindrome = palindrome.isPalindrome(str1);
        System.out.println(isPalindrome); // true

        String str2 = "amina";
        boolean isPalindrome2 = palindrome.isPalindrome(str2);
        System.out.println(isPalindrome2); // false
    }

}
