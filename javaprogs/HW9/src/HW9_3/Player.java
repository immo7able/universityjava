package HW9_3;

import java.util.ArrayList;

public class Player {
    String name;
    double price;
    int age;
    public Player(String name, double price, int age){
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Player> list = new ArrayList<>();
        list.add(new Player("A", 1000, 16));
        list.add(new Player("B", 2000, 18));
        list.add(new Player("C", 3000, 22));
        list.add(new Player("D", 2500, 23));
        list.add(new Player("E", 1500, 18));
        list.add(new Player("F", 3500, 19));
        list.add(new Player("G", 4000, 24));
        list.add(new Player("H", 2200, 21));
        list.add(new Player("I", 3400, 21));
        list.add(new Player("J", 3200, 23));
        double sum=0;
        double mid = 0;
        for(int i=0;i<list.size();i++){
            mid+=list.get(i).getPrice();
            sum+=list.get(i).getAge();
        }
        mid/=list.size();
        System.out.println("Sum"+sum);
        System.out.println("Mid"+mid);
    }
}
