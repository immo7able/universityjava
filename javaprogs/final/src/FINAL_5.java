import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FINAL_5 {
    public static void main(String[] args) {
        Person a = new Person("A","A","10");
        Person b = new Person("B","B","11");
        Person c = new Person("C","C","12");
        Person d = new Person("D","D","11");
        Person e = new Person("E","E","13");
        Person f = new Person("F","F","15");
        Person g = new Person("G","G","18");
        Person h = new Person("H","H","13");
        Person i = new Person("I","I","12");
        Person j = new Person("J","J","16");
        ArrayList<Person> persons= new ArrayList<Person>();
        persons.add(a);
        persons.add(b);
        persons.add(c);
        persons.add(d);
        persons.add(e);
        persons.add(f);
        persons.add(g);
        persons.add(h);
        persons.add(i);
        persons.add(j);
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        for(int l=0;l< persons.size();l++){
            System.out.println(persons.get(l).toString());
        }
    }
}
class Person{
    String name;
    String surname;
    String age;
    public Person(String name, String surname, String age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String toString(){
        return "Name: "+this.name+" Surname: "+this.surname+" Age:"+this.age;
    }
}

