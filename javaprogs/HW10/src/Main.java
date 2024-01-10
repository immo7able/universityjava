import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        int i=1;
        while(!a.isEmpty()){
            if(i==3)
                System.out.println(a.poll());
            a.poll();
            i++;
        }
    }
}