import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
        int n=in.nextInt(), sum=0;
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min)
                min=a[i];
        }
        for(int i=0;i<n;i++){
            sum+=a[i]-min;
        }
        System.out.println(sum);
        }
    }
}
