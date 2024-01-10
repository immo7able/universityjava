import java.util.Scanner;
public class HW3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = in.next();
        System.out.print("Enter the second string: ");
        String b = in.next();
        String c = a+b;
        System.out.println("Combined string: " + c);
    }
}
