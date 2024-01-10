import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("A", "A", "16"));
        list.add(new Person("B", "B", "18"));
        list.add(new Person("C", "C", "22"));
        list.add(new Person("D", "D", "23"));
        list.add(new Person("E", "E", "18"));
        list.add(new Person("F", "F", "19"));
        list.add(new Person("G", "G", "24"));
        list.add(new Person("H", "H", "21"));
        list.add(new Person("I", "I", "21"));
        list.add(new Person("J", "J", "23"));
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        for(Person a: list){
            System.out.println(a.toString());
        }
    }
}
