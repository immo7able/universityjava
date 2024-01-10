import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            int[] a = new int[k], b=new int[k];
            boolean is=true;
            for(int j=0;j<k;j++){
                a[j]=in.nextInt();
                b[j]=a[j];
            }
            Arrays.sort(b);
            for(int j=0;j<k;j++){
                if (a[j] % 2 != b[j] % 2) {
                    is = false;
                    break;
                }
            }
            if(is)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
