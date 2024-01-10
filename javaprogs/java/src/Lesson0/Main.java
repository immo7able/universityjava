package Lesson0;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Insect",0.1,0.01);
        Dog dog = new Dog("Mammal", 1.5, 30);
        dog.barking();
        animal.move();
    }
}
