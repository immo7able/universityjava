import java.util.Scanner;

public class MT1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println((a*b*3)*((b+3)*5)+10*a);
    }
}
