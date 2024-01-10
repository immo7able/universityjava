import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int[] a = new int[3];
            for(int j=0;j<3;j++){
                a[j]=in.nextInt();
            }
            if(a[0]+a[1]==a[2])
                System.out.println("+");
            else {
                System.out.println("-");
            }
        }
    }
}
