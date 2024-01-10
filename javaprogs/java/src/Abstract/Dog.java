package Abstract;

public class Dog extends Animal implements Sleepable{
    @Override
    public void sleep() {System.out.println("Dog is sleeping");}
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    @Override
    public void run(){
        System.out.println("Dog is running");
    }
}
