import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();
        List<Person> list3 = new ArrayList<>();
        list1.add(new Person("Z", "A", "16"));
        list1.add(new Person("E", "B", "18"));
        list1.add(new Person("G", "C", "22"));
        list1.add(new Person("S", "D", "23"));
        list1.add(new Person("X", "E", "18"));
        list2.add(new Person("A", "F", "19"));
        list2.add(new Person("K", "G", "24"));
        list2.add(new Person("J", "H", "21"));
        list2.add(new Person("I", "I", "21"));
        list2.add(new Person("U", "J", "23"));
        list3.add(new Person("Y", "K", "16"));
        list3.add(new Person("T", "L", "22"));
        list3.add(new Person("R", "M", "21"));
        list3.add(new Person("D", "N", "25"));
        list3.add(new Person("S", "O", "24"));
        List<List<Person>> alllists = new ArrayList<>();
        alllists.add(list1);
        alllists.add(list2);
        alllists.add(list3);
        for(List<Person> i : alllists){
            Collections.sort(i, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
        }        for(List<Person> i:alllists){
            for(Person j:i){
                System.out.println(j.toString());
            }
        }
    }
}
