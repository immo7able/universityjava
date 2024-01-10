package Generics;

public class Main4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        show(a);
        Cat b = new Cat();
        show(b);
        Human c = new Human();
        //show(c); Не работает, если дженерик наследуется
    }
    public static <T extends Animal & Comparable & Cloneable> void show(T a){

    }
}
class Animal extends Bacteria implements Comparable, Cloneable{
    @Override
    public int compareTo(Object a){
        return 0;
    }

}
class Bacteria{

}
class Cat extends Animal{

}
class Human{

}
