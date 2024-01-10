import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> keys1 = new ArrayList<Integer>();
        keys1.add(1);
        keys1.add(3);
        List<Integer> keys2 = new ArrayList<Integer>();
        keys2.add(3);
        keys2.add(0);
        keys2.add(1);
        List<Integer> keys3 = new ArrayList<Integer>();
        keys3.add(2);
        List<Integer> keys4 = new ArrayList<Integer>();
        keys4.add(0);
        List<List<Integer>> rooms = new ArrayList<List<Integer>>();
        rooms.add(keys1);
        rooms.add(keys2);
        rooms.add(keys3);
        rooms.add(keys4);
        HashSet<Integer> keys = new HashSet<Integer>();
        for(int j=0;j<rooms.get(0).size();j++) {
            keys.add(rooms.get(0).get(j));
        }
        for(int i=1;i<rooms.size();i++){
            if(keys.contains(i)){
                for(int j=0;j<rooms.get(i).get(j);j++)
                    keys.add(rooms.get(i).get(j));
            }
        }
        if(keys.size()==rooms.size())
            System.out.println("true");
        else System.out.println("false");
    }
}