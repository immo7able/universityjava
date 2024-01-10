import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), min = Integer.MAX_VALUE, minfirst = 0, minsecond = 0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=1;i<n;i++){
            int b=Math.abs(a[i]-a[i-1]);
            if(b<min) {
                min = b;
                minfirst=i;
                minsecond=i+1;
            }
        }
        if(Math.abs(a[n-1]-a[0])<min)
            System.out.println(n+" "+1);
        else System.out.println(minfirst+" "+minsecond);
    }
}
