import java.util.Scanner;
public class HW3_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        System.out.println("Your name is: " + firstName.charAt(0) + ". " + lastName);
    }
 }
