import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] b = new int[n];
        int sum=0, f=0;
        for(int i=0;i<n;i++) {
            b[i] = in.nextInt();
        }
        int max=b[0];
        for(int i=0;i<n;i++){
            if (b[i] >= max) {
                sum++;
                max=b[i];
                if(sum>f)
                    f=sum;
            }
            else {
                max = b[i];
                if(sum>f)
                    f=sum;
                sum=1;
            }
        }System.out.println(f);
    }
}
