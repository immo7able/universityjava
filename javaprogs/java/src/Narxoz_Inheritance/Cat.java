package Narxoz_Inheritance;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
    public Cat(){
        System.out.println("Cat constructor");
    }
    public void meow(){
        System.out.println("Cat is meowing");
    }
    public void sneeze(){
        System.out.println("Cat is sneezing");
    }
}
