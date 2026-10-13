package org.example;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Clean strings (convert to lowercase for case-insensitivity)
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();

        // Sort both character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // If sorted arrays are identical, they are anagrams
        return Arrays.equals(array1, array2);
    }
}
