import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Person> persons= new ArrayList<>();
        persons.add(new Person("A","A", 20));
        persons.add(new Person("B","B", 18));
        persons.add(new Person("C","C", 19));
        persons.add(new Person("D","D", 21));
        persons.add(new Person("E","E", 18));
        Collections.sort(persons);
        for(Person i:persons){
            System.out.println(i.toString());
        }
    }
}
class Person implements Comparable<Person>{
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Person a){
        return this.getAge()-a.getAge();
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" Surname: "+this.surname+" Age:"+this.age;
    }
}
