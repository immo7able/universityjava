import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            if(a==c||b==d){
                System.out.println(a+" "+d);
            } else if (c>a&&b>d) {
                System.out.println(c+" "+d);
            } else if (a>c&&d>b) {
                System.out.println(a+" "+b);
            } else {
                System.out.println(a+" "+c);
            }
        }
    }
}
