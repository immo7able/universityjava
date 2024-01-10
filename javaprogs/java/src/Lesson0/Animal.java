package Lesson0;

public class Animal {
    String type;
    double size;
    double weight;
    public Animal(){}
    public Animal(String type, double size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void barking(){
        System.out.println("Animal is barking");
    }
    public void move(){
        System.out.println("Animal is moving");
    }
}
