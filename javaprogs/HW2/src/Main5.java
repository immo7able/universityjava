import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long f;
        if (n % 2 == 0) {
            f = n / 2;
        } else {
            f = -(n + 1) / 2;
        }
        System.out.println(f);
    }
}
