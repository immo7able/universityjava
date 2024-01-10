import java.util.Scanner;
public class HW3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.print("Enter an index: ");
        int x = in.nextInt();
        if (x < 0 || x >= s.length()) {
            System.out.println("Invalid index!");
        } else {
            char c = s.charAt(x);
            System.out.println("Character at index " + x + " is: " + c);
        }
    }
}
