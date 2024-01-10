import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if((a-1)<(c-1+Math.abs(b-c)))
                System.out.println(1);
            else if ((a-1)>(c-1+Math.abs(b-c)))
                System.out.println(2);
            else System.out.println(3);
        }
    }
}
