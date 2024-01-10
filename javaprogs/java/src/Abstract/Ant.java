package Abstract;

public abstract class Ant extends Animal{

    @Override
    public void eat() {
        System.out.println("Ant is eating");
    }
    @Override
    public void run() {
        System.out.println("Ant is running");
    }
}
