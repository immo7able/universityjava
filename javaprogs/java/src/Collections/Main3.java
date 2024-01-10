package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Timur");
        names.add("Nurs");
        names.add("Nurik");
        names.add("Michael");
        List<String> new_names =
                names.stream().filter(x-> !x.startsWith("N")).collect(Collectors.toList());
        for(String s: new_names)
            System.out.println(s);
    }
}
