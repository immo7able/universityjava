import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt(), blue=0;
            int[] a=new int[k];
            for(int j=0;j<k;j++){
                a[j]=in.nextInt();
                if(a[j]%2!=0)
                    blue++;
            }
            if(blue%2!=0)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
