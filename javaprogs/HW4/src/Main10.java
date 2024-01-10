import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            Integer[] b = new Integer[a];
            for(int j=0;j<a;j++){
                b[j]= in.nextInt();
            }
            Arrays.sort(b, Collections.reverseOrder());
            int sum1=b[0], sum2=0;
            for(int j=1;j<a;j++){
                if(sum1<sum2)
                    sum1+=b[j];
                else sum2+=b[j];
            }
            if(sum1==sum2)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
