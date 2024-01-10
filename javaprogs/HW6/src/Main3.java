import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            if(a%2020==0||a%2021==0)
                System.out.println("YES");
            else{
                if(a/2020<=a%2020)
                    System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
