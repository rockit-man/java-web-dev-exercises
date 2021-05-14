package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;
import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {

        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with.";
        char[] charsInString = phrase.toCharArray();

//        Scanner input = new Scanner(System.in);
//        System.out.println("String: ");

        HashMap<Character, Integer> charMap = new HashMap<>();
        System.out.println(charsInString);

        for (char ch : charsInString) {
            charMap.put(ch, 0);
        }

        for (char ch : charsInString) {
            charMap.put(ch, charMap.get(ch) + 1);
        }

        System.out.println(charMap);

//        for (Map.Entry<Character, Integer> oneChar : charMap.entrySet()) {
//            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
//        }
    }
}
