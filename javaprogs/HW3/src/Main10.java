import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        int max=0;
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
            if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(max-a[i]!=0)
                System.out.print(max-a[i]+" ");
        }
    }
}
