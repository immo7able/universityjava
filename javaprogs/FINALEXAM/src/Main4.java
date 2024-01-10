import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            long k=in.nextLong();
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            if(a==k||b==k||c==k)
                System.out.println(0);
            else{
                if(a>=b&&a>=c)
                    System.out.println(2*a-k);
                else if(b>=a&&b>=c)
                    System.out.println(2*b-k);
                else
                    System.out.println(2*c-k);
                if(a<=b&&a<=c)
                    System.out.println(a-k);
                else if (b<=a&&b<=c)
                    System.out.println(b-k);
                else System.out.println(c-k);
            }
        }
    }
}
