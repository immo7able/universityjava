package Narxoz_Inheritance;

public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public Animal(){
        System.out.println("Animal constructor");
    }
    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void run(){
        System.out.println("Animal is running");
    }
    private void think(){
        System.out.println("Animal is thinking");
    }
}
