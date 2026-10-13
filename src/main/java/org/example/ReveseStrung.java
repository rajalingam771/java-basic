package org.example;

public class ReveseStrung {
    public static void main(String[] arg){
        String original = "Java";
        String reversed = "";

        // Iterate backward from the last character to index 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // Extract and append character
        }

        System.out.println(reversed);
    }
}
