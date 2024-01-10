package Collections;

import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);
        for(Integer x : set)
            System.out.println(x);
    }
}
