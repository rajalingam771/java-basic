package org.example;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "radar";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends moving inward
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Found a mismatch
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

}
