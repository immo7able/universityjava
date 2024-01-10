package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(2);
        for(int i=0;i< list.size();i++)
            System.out.println(list.get(i));
        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.remove(3);
        for(int i=0;i< linkedList.size();i++)
            System.out.println(linkedList.get(i));
    }
}
