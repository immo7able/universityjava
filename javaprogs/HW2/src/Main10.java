import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] t = new boolean[n];
        int p = in.nextInt();
        for (int i = 0; i < p; i++){
            int c = in.nextInt();
            t[c-1] = true;
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++){
            int d = in.nextInt();
            t[d-1] = true;
        }
        boolean f = true;
        for (int i = 0; i < t.length; i++) {
            if (!t[i]) {
                f = false;
                break;
            }
        }
        if(f){
            System.out.println("I become the guy.");
        }else {
            System.out.println("Oh, my keyboard!");
        }

    }
}
