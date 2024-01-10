package Lesson0;

public class Dog extends Animal{
    public Dog(){}
    public Dog(String type, double size, double weight){
        super(type, size, weight);
    }
    @Override
    public void barking(){
        System.out.println("Dog is barking");
    }
    @Override
    public void move(){
        System.out.println("Dog is moving");
    }
}
