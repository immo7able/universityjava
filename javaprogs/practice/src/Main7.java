import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        if(s%n==0)
            System.out.println(s/n);
        else System.out.println(s/n+1);
    }
}
