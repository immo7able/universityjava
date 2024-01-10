import java.util.Scanner;
public class HW3_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.print("Enter a character: ");
        char a = in.next().charAt(0);
        int firstIndex = s.indexOf(a);
        int lastIndex = s.lastIndexOf(a);
        if (firstIndex == -1) {
            System.out.println(firstIndex);
        } else {
            System.out.println("First index: " + firstIndex);
            System.out.println("Last index: " + lastIndex);
        }
    }
}
