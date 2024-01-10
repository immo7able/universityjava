import java.util.Scanner;

public class MT1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        if((2*a*b)%3==0)
            System.out.println("Divisible by 3");
        else
            System.out.println("Not divisible by 3");
    }
}
