package org.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "hello rajalingam";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        if (str == null || str.isEmpty()) return;

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            // If the character is already in 'seen', it's a duplicate
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        System.out.println("Duplicate characters in \"" + str + "\": " + duplicates);
    }
}