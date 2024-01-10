package Narxoz_Inheritance;

import java.sql.SQLOutput;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    public Dog(){
        System.out.println("Dog constructor");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void guard(){
        System.out.println("Dog is guarding");
    }
}
