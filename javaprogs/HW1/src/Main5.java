import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            long n = in.nextLong(), sum=0;
            while(n>0){
                if(n%10==4||n%10==7)
                    sum++;
                n/=10;
            }
            if(sum==4||sum==7)
                System.out.println("YES");
            else System.out.println("NO");
    }
}
