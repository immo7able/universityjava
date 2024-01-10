import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(a+b>=10||b+c>=10||a+c>=10)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
