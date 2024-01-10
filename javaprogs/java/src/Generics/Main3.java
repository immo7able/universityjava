package Generics;

import java.util.ArrayList;
import java.util.Date;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.add("ABC");
        //list.add(new Date());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
