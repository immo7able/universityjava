import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), max=0,sum=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<n;i++){
            sum+=max-a[i];
        }
        System.out.println(sum);
    }
}