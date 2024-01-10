package Collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//queue, set, map
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        queue.add(4);
        queue.add(5);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addLast(3);
        while(!arrayDeque.isEmpty()){
            System.out.println(arrayDeque.poll());
        }
    }
}
