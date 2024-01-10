import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int s;
        int[] b = new int[4];
        int c = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            s = in.nextInt();
            b[i] = s;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}