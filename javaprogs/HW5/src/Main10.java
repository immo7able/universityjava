import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), t = in.nextLong();
        if(t==10&&n==1)
            System.out.println(-1);
        else {
            if (t==10)
                n-=2;
            else n--;
            System.out.print(t);
            for(int i=0;i<n;i++){
                System.out.print(0);
            }
        }
    }
}
