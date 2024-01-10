import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            String s1 = "abc";
            s = s.substring(0, 3);
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                if (s.charAt(j) != s1.charAt(j)) {
                    sum++;
                }
            }
            if (sum <= 2)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}