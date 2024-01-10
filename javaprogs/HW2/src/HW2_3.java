import java.util.Scanner;

public class HW2_3 {
    public static void displaySortedNumbers(int a, int b, int c){
        if(a>b&&a>c){
            if(b>c)System.out.println(c+" "+b+" "+a);
            else if(c>b) System.out.println(b+" "+c+" "+a);
        }
        else if(b>a&&b>c) {
            if(a>c) System.out.println(c+" "+a+" "+b);
            else if(c>a) System.out.println(a+" "+c+" "+b);
        }
        else if(c>b&&c>a) {
            if(a>b) System.out.println(b+" "+a+" "+c);
            else if(b>a) System.out.println(a+" "+b+" "+c);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        displaySortedNumbers(a,b,c);
    }
}
