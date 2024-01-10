import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String i;
        while(true) {
            i = in.next();
            if (i.equalsIgnoreCase("Marat"))
                break;
            else {
                try {
                    map.put(i, map.get(i) + 1);
                } catch (NullPointerException e) {
                    map.put(i, 1);
                }
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}

