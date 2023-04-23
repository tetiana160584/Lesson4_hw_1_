package org.example.Lesson10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson_10 {
    public static void printWords(String string) {
        String[] words = string.replaceAll("[,\\s.]+", " ").split(" ");
        Set<String> Words = new HashSet<>(Arrays.asList(words));
        for (String word : Words) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));

        }
    }
}
