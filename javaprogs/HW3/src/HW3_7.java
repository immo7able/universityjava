import java.util.Scanner;
public class HW3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.print("Enter the first index: ");
        int start = in.nextInt();
        System.out.print("Enter the second index: ");
        int end = in.nextInt();
        String s2 = new String();
        char[] arr = s.toCharArray();
        for(int i=start;i<end;i++){
            s2+=arr[i];
        }
        System.out.println("Symbols between: "+s2);
    }
}
