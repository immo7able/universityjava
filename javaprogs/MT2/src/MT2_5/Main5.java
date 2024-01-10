package MT2_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Person> persons= new ArrayList<>();
        Scanner in = new Scanner(System.in);
        persons.add(new Person("A", "G", "Kz", 18));
        persons.add(new Person("C", "J", "Ru", 22));
        persons.add(new Person("B", "F", "Ar", 21));
        persons.add(new Person("D", "I", "Ua", 18));
        persons.add(new Person("E", "H", "Kg", 19));
        int a;
        while(true){
            System.out.println("1 - name<, 2 - surname>, 3 - citizenship<, 4 - age>, 0 - exit.");
            a=in.nextInt();
            if(a==1){
                Collections.sort(persons, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getName().compareTo(o1.getName());
                    }
                });
                for(Person i:persons){
                    System.out.println(i.toString());
                }
            } else if (a==2) {
                Collections.sort(persons, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getSurname().compareTo(o2.getSurname());
                    }
                });
                for(Person i:persons){
                    System.out.println(i.toString());
                }
            } else if (a==3) {
                Collections.sort(persons, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getCitizenship().compareTo(o1.getCitizenship());
                    }
                });
                for(Person i:persons){
                    System.out.println(i.toString());
                }
            } else if(a==4){
                Collections.sort(persons, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge()-o2.getAge();
                    }
                });
                for(Person i:persons){
                    System.out.println(i.toString());
                }
            } else if (a==0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Неправильный номер");
                continue;}
        }
    }
}
class Person{
    String name;
    String surname;
    String citizenship;
    int age;

    public Person(String name, String surname, String citizenship, int age) {
        this.name = name;
        this.surname = surname;
        this.citizenship = citizenship;
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

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" Surname: "+this.surname+" Citizenship: "+this.citizenship+" Age: "+this.age;
    }
}
