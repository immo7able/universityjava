import java.util.Scanner;
public class HW3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = in.next();
        System.out.print("Enter the second string: ");
        String b = in.next();
        if (a.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
