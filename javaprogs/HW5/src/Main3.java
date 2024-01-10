import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            HashSet <Integer> has = new HashSet<>();
            for(int j=0;j<k;j++){
                has.add(in.nextInt());
            }
            if(has.size()==k)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
