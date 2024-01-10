import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CODE1914B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            int l=in.nextInt();
            int[] a= new int[k];
            if(l==0){
                for(int j=k;j>0;j--){
                    a[j-1]=j;
                    System.out.print(a[j-1]+" ");
                }
            }
            else if(l==k-1){
                for(int j=1;j<=k;j++){
                    a[j-1]=j;
                    System.out.print(a[j-1]+" ");
                }
            }
            else {
                for(int j=1;j<=k;j++){
                    a[j-1]=j;
                }
                Integer[] b = new Integer[k-l];
                for(int j=0;j<k-l;j++){
                    b[j]=a[j];
                }
                Arrays.sort(b, Collections.reverseOrder());
                for(int j=0;j<k-l;j++){
                    a[j]=b[j];
                }
                for(int j=0;j<k;j++){
                    System.out.print(a[j]+" ");
                }
            }
        }
    }
}
