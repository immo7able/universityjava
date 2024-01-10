import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int k=in.nextInt();
        int[] b = new int[k];
        for(int i=0;i<k;i++){
            b[i]=in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0,sum=0;
        while(i<n&&j<k){
            if(Math.abs(a[i]-b[j])<=1){
                sum++;
                i++;
                j++;
            } else if (a[i]<b[j]) {
                i++;
            } else if (a[i]>b[j]) {
                j++;
            }
        }
        System.out.println(sum);
    }
}
