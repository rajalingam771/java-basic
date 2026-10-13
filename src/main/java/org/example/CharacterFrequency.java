package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args){
        String name="hello Rajalingam";
        findFrequency(name);
    }
    public static void findFrequency(String str){
        if (str == null) return;
        Map<Character,Integer> charMap=new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            System.out.println("Character frequencies in \"" + str + "\":");
            for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
                System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
            }
        }
    }
}
