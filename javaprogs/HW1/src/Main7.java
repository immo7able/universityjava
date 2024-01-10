import java.util.Objects;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        char[] arr = s1.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        if(Objects.equals(s2, new String(arr)))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
