import java.util.Scanner;

public class CONTEST2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s = in.next();
        s=s.toLowerCase();
        if(s.contains("abcdefghijklmnopqrstuvwxyz")){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
