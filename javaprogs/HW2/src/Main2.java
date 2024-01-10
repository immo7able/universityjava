import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int s = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            s += a[i];
            c++;

            int f = 0;
            for (int j = i + 1; j < n; j++) {
                f += a[j];
            }

            if (s > f) {
                break;
            }
        }

        System.out.println(c);
    }
}