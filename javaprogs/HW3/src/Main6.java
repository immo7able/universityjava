import java.util.Scanner;
import java.util.TreeMap;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String c = in.next();
        a+=b;
        if(a.length()==c.length()){
            TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
            TreeMap <Character, Integer> maps = new TreeMap<Character, Integer>();
            for(char i: a.toCharArray()){
                if(map.containsKey(i))
                    map.put(i, map.get(i)+1);
                else map.put(i, 1);
            }
            for(char i: c.toCharArray()){
                if(maps.containsKey(i))
                    maps.put(i, maps.get(i)+1);
                else maps.put(i, 1);
            }
            Boolean m=true;
            for(char i: maps.keySet()){
                if(!maps.get(i).equals(map.get(i))){
                    m=false;
                    break;
                }
            }
            if(m)
                System.out.println("YES");
            else System.out.println("NO");
        }else System.out.println("NO");
    }
}
