import java.util.Scanner;

public class FINAL_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char a = in.next().charAt(0);
        char b = in.next().charAt(0);
        s=s.replace(a,b);
        System.out.println(s);
    }
}
