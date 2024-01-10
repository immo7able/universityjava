package Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person Ahmad = new Person("Ahmad", "Abuallaban", 18, 67, "male", "Kz");
        Person Sanjar = new Person("Sanjar","Shamhanov", 21, 60, "male", "Kz");
        Person Zhibek = new Person("Zhibek", "Mergenbayeva", 15, 45, "female", "Kz");
        System.out.println(Ahmad);
        System.out.println(Sanjar);
        System.out.println(Zhibek);
        Person[] persons = {Ahmad, Sanjar, Zhibek};
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getName().compareTo(p2.getName()) < 0)
                    return -1;
                if(p1.getName().compareTo(p2.getName()) > 0)
                    return 1;
                else return 0;
            }
        });
        /*for(int i=0;i< persons.length;i++){
            for(int j=i+1;j<persons.length;j++){
                if(persons[i].getAge()>persons[j].getAge()){
                    Person temp = persons[i];
                    persons[i]=persons[j];
                    persons[j]=temp;
                }
            }
        }*/
        for(int i=0;i<persons.length;i++){
            System.out.println(persons[i].getName()+" "+persons[i].getAge());
        }
    }
}
