package Abstract;

public class Cat extends Animal implements Sleepable {
    @Override
    public void sleep() {System.out.println("Cat is sleeping");}
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
    @Override
    public void run(){
        System.out.println("Cat is running");
    }
}
