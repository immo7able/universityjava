import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>b) {
            a-=b;
            System.out.println(b+" "+a/2);
        }else{
            b-=a;
            System.out.println(a+" "+b/2);
        }
    }
}
