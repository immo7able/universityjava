import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String p = in.next();
        int d = 1;

        for (int i = 1; i < n ; i++) {
            String c = in.next();
            if (!c.equals(p)) {
                d++;
            }
            p = c;
        }
        System.out.println(d);
    }
}