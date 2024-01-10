import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int x = in.nextInt(), y=in.nextInt(), a=in.nextInt(), b=in.nextInt(), sum=0;
            if((y-x)%(a+b)==0)
                sum=(y-x)/(a+b);
            else sum=-1;
            System.out.println(sum);
        }
    }
}