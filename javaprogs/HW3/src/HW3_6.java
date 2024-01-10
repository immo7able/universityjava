import java.util.Scanner;
public class HW3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.print("Enter the character to replace: ");
        char a = in.next().charAt(0);
        System.out.print("Enter the replacement character: ");
        char b = in.next().charAt(0);
        String c = s.replace(a, b);
        System.out.println("Replaced string: " + c);
    }
}
