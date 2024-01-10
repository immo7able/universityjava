package OOP_Object;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int weight;
    /*public void accept(String name, String surname, int age, int weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }*/
    public Person(String name, String surname, int age, int weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }
    public Person(String name, String surname, int age){
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void talk(){
        System.out.println(name+" is talking");
    }
}
