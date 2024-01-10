import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            boolean f = false;
            int k = in.nextInt(), temp=0;
            HashMap <Integer, Integer> hash = new HashMap<Integer, Integer>();
            for(int j=0;j<k;j++){
                int a = in.nextInt();
                if(hash.containsKey(a))
                    hash.put(a, hash.get(a)+1);
                else hash.put(a, 1);
                for(hash.entrySet())
                if(hash.containsValue(3)&&hash.get(a)>=3)
                {
                    f=true;
                    temp=a;
                }
            }
            if(temp==0)
                System.out.println(-1);
            else System.out.println(temp);
        }
    }
}