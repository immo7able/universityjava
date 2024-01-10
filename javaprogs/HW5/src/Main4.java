import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), sum=0,t=1;
        while(n>0){
            if(n%10>=5){
                if(n/10==0&&n%10==9)
                    sum+=(n%10)*t;
                else
                    sum+=(9-n%10)*t;
            }
            else {
                sum+=(n%10)*t;
            }
            t*=10;
            n/=10;
        }
        System.out.println(sum);
    }
}
