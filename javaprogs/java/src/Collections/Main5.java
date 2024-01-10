package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main5 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(); //добавить компаратор, чтобы поменять порядок
        set.add("Ahmad");
        set.add("Sanjar");
        set.add("Zhibek");
        set.add("Timur");
        set.add("Dias");
        set.add("Ahmad");
        for(String x : set)
            System.out.println(x);
    }
}
