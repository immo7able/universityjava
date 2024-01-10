package Comparable;

public class Person implements Comparable<Person>, Cloneable{
    String name;
    String surname;
    int age;
    int weight;
    String gender;
    String citizenship;
    public Person(String name, String surname, int age, int weight, String gender, String citizenship){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.citizenship = citizenship;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    public String toString(){
        return "Person{"
                +"name='"+name
                +"', surname='"+surname
                +"', age="+age
                +", weight="+weight
                +", gender='"+gender
                +"', citizenship='"+citizenship
                +"'}";
    }
    @Override
    public int compareTo(Person p){
        if (this.getAge() < p.getAge())
            return -1;
        else if(this.getAge() > p.getAge())
            return 1;
        else return 0;
    }
    public Person clone() throws CloneNotSupportedException{
        return (Person)super.clone();
    }
}
