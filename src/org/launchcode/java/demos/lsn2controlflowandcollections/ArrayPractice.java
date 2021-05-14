package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i : someInts) {
            System.out.println(i);
        }

        for (int i : someInts) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }

        String noSam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] splitSam = noSam.split(" ");
        System.out.println(Arrays.toString(splitSam));

        String[] sentenceSam = noSam.split("\\.");
        System.out.println(Arrays.toString(sentenceSam));

    }
}
