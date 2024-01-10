package Narxoz_Inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pipunya");
        Dog dog = new Dog();
        System.out.println(cat.getName());
        cat.eat();
        dog.eat();
        Animal animal = new Cat(); //polymorphism
        Animal animal2 = new Dog();
        animal.run();
        animal.eat();
        animal2.eat();
        animal2.run();
        Animal[] animals = {cat, dog, new MaineCoon()};
        Animal maineCoone = new MaineCoon();
        maineCoone.eat();
        ((Cat)animal).meow();
        checkEat(animal);
        checkEat(animal2);
    }

    public static void checkEat(Animal animal) {
        if(animal instanceof Cat){
            System.out.println("This is cat");
            animal.eat();}else System.out.println("This is dog");
    }
}
