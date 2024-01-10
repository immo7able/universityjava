import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        int [] f = new int[n];
        for(int i = 0 ; i < n; i++){
            f[i] =-1;
            for(int j = 0; j < n; j++){
                if(p[j] == i + 1){
                    f[i] = j + 1;
                    break;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(f[i] + " ");
        }
    }
}
