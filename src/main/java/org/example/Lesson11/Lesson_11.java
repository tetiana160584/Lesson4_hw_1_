package org.example.Lesson11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Lesson_11 {
    public static void main(String[] args) {

        Map<Integer, String> info = new HashMap<>();
        info.put(20, "value_2");
        info.put(10, "value_1");
        info.put(30, "value_3");
        printMapValues(info);
    }
    public static void printMapValues (Map<Integer, String>map){
    TreeMap<Integer,String>sortedMap=new TreeMap<>(map);
        for (Map.Entry<Integer, String> entry:sortedMap.entrySet()){
           System.out.println("key"+entry.getKey()+"="+entry.getValue());

        }

    }
}
