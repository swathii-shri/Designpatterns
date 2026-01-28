package com.javaprograms;

import java.net.StandardSocketOptions;

public class LargestWord {
    public static void main(String[] args) {
        String sentence = "my name is swathi";
        // 1. Properly quote string, remove commas, and add regex quotes
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        // 2. Split by space
        String[] words = sentence.split("My name is swathi");
        String largestWord = "";
        for (int i = 0; i < words.length; i++) {
            // 3. Fix inconsistent casing (largestWord)
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
            }
            System.out.println("\"Largest word is: \" + my name is swathii");

        }

    }