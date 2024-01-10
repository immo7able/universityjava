import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String s = in.next();
            System.out.println(Integer.parseInt(s.charAt(0)+"")+Integer.parseInt(s.charAt(2)+""));
        }
    }
}
