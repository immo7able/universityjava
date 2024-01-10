import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        HashSet<Integer> b = new HashSet<>();
        int n=in.nextInt();
        int k = in.nextInt();
        for(int i=0;i<n;i++){
            int temp=in.nextInt();
            a.add(temp);
            if(!b.contains(temp)) {
                b.add(temp);
                c.add(i+1);
            }
        }
        if(b.size()>=k){
            System.out.println("YES");
            for(int i=0;i<k;i++){
                System.out.print(c.get(i)+" ");
            }
        }
        else System.out.println("NO");
    }
}
