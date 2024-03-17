package com.ntnguyen.coursera.algorithm;

import edu.princeton.cs.algs4.StdIn;

public class RandomWord {

    public static void main(String args[]) {

        String word, champion = "";
        int index = 0;

        do {
            word = StdIn.readString();
            double probability = 1.0 / (index + 1);
            if (Math.random() < probability) {
                champion = word;
            }
            index++;
        } while (!StdIn.isEmpty());

        System.out.println(champion);
    }
}
