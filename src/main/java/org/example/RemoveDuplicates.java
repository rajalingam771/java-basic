package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello rajalingam";
        String result = removeDuplicateChars(input);

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result);
    }

    public static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) return str;

        // LinkedHashSet removes duplicates while maintaining insertion order
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Rebuild the string from the unique characters in the set
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}