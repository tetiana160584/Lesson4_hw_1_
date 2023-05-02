package org.example.Lesson11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Lesson_11 {
    public static void main(String[] args) {
        Map<Integer, String> info = new HashMap<>();
        info.put(20, "value_2");
        info.put(10, "value_1");
        info.put(30, "value_3");


        List<Map.Entry<Integer, String>> sortedEntries = info.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());

        for (Map.Entry<Integer, String> entry : sortedEntries) {
            System.out.println("key" + entry.getKey() + "="+ entry.getValue());
        }

        }
    }





