package Collections;

import java.util.Vector;

public class Main9 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        for(int i=0;i<vector.size();i++)
            System.out.println(vector.get(i));
    }
}