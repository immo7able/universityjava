package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override //Смена порядка
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(2);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
