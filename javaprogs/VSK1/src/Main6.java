import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt(), temp=0;
            int[] a = new int[k];
            for(int j=0;j<k;j++){
                a[j]=in.nextInt();
            }
            Arrays.sort(a);
            for(int j=0;j<k-2;j++){
                if(a[j]==a[j+1]&&a[j+1]==a[j+2])
                    temp=a[j];
            }
            if(temp==0)
                System.out.println(-1);
            else System.out.println(temp);
        }
    }
}
