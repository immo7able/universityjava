package HW6_1;

public abstract class Food {
    String name;
    public Food(String name){
        this.name = name;
    }
    abstract double getCalories();
}
