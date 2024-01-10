import java.util.Scanner;
public class HW2_1 {
    public static int sumDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumDigits(n));
    }
}
