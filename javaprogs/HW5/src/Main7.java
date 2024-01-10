import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), res=0;
        for(int i=1;i<n;i++) {
            if((n-i)%i==0)
                res++;
        }
        System.out.println(res);
    }
}
