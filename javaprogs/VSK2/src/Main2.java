import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q= in.nextInt();
        for(int i=0;i<q;i++){
            int n=in.nextInt();
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=in.nextInt();
            }
            if((sum/n)*n<sum)
                System.out.println(sum/n+1);
            else System.out.println(sum/n);
        }
    }
}
