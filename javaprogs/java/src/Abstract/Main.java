package Abstract;

public class Main {
    public static void main(String[] args) {
        Sleepable cat = new Cat();
        Sleepable dog = new Dog();
        cat.sleep();
        dog.sleep();
    }
}
