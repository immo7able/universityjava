package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Yekaterina",18);
        map.put("Timur", 32);
        map.put("Zair",20);
        map.put("Ahmad",20);
        map.put("Rakhmadi",30);
        System.out.println(map.get("Rakhmadi"));
        for(Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
