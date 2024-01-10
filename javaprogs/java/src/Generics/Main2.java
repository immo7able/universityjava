package Generics;

public class Main2 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("ABC", "CDE");
        System.out.println(person.getName());
    }
}
class Person<T>{
    T name;
    T surname;
    //static T age;
    public void doingSomething(T t){
        //((String)t).toLowerCase();
    }
    public Person(T name, T surname){
        //T t = new T();
        T t = (T)new Object();
        this.name = name;
        this.surname = surname;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSurname() {
        return surname;
    }

    public void setSurname(T surname) {
        this.surname = surname;
    }
}
