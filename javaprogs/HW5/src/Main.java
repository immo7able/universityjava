import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt(), sum=0;
            String s=in.next();
            s=s.substring(0,k);
            HashSet <Character> hash = new HashSet<>();
            for(int j=0;j<s.length();j++){
                if(hash.contains(s.charAt(j)))
                {
                    sum+=1;
                }
                else {
                    hash.add(s.charAt(j));
                    sum+=2;
                }
            }
            System.out.println(sum);
        }
    }
}