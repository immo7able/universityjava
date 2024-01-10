package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Bacteria> list = new ArrayList<>();
        list.add(new Animal());
        list.add(new Animal());
        list.add(new Animal());
        list.add(new Bacteria());
        check1(list);
        List<Human> humans = new ArrayList<>();
        //check2(humans);
        //check2(list);
        check3(list);
    }
    public static void check1(List<?> list){

    }
    public static void check2(List<? extends Animal> list){

    }
    public static void check3(List<? super Animal> list){

    }
}
