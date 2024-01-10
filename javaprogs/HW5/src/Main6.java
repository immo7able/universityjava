import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt(), odd=0, even=0;
            for(int j=0;j<2*k;j++){
                int a=in.nextInt();
                if(a%2==0)
                    even++;
                else odd++;
            }
            if(odd==even)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
