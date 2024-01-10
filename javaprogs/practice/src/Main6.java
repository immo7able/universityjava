import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            int[] a = new int[k];
            ArrayList<Integer> odd = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            for(int j=0;j<k;j++){
                a[j]=in.nextInt();
                if(a[j]%2==0)
                    even.add(j+1);
                else odd.add(j+1);
            }
            if(odd.size()>=3){
                System.out.println("YES");
                System.out.println(odd.get(0)+" "+odd.get(1)+" "+odd.get(2));
            } else if (even.size()>=2&&odd.size()>=1) {
                System.out.println("YES");
                System.out.println(even.get(0)+" "+ even.get(1)+" "+odd.get(0));
            }else System.out.println("NO");
        }
    }
}
