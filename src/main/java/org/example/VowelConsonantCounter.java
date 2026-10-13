package org.example;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String str) {
        if (str == null) {
            System.out.println("String is null.");
            return;
        }

        int vowels = 0;
        int consonants = 0;

        // Convert string to lowercase to handle case-insensitivity easily
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a valid lowercase alphabet letter (consonant)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            // Spaces, numbers, and punctuation marks are ignored
        }

        System.out.println("Original String: " + str);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
