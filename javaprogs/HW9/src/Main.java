import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        //list.sort(Comparator.naturalOrder());
        Collections.sort(list);
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}