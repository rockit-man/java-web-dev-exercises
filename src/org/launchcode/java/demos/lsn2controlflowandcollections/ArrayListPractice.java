package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        String phrase = "I would not could not in a box";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        Scanner input = new Scanner(System.in);

        System.out.println(sumEven(someIntegers));

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        printFiveLetterWords(wordList, numChars);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> arr, int length) {
        for (String word : arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
