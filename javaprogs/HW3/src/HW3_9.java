import java.util.Scanner;

public class HW3_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        s=s.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
        System.out.println("Only vowels: "+s);
    }
}
