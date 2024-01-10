import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int age = in.nextInt();
        System.out.println("Hello, " + name + " " + age + " years old");
    }
}
