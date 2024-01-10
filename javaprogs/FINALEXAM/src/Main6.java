import java.util.HashSet;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<n;i++){
            String temp = in.next();
            if(!s.contains(temp)){
                s.add(temp);
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
