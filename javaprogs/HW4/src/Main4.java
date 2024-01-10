import java.util.HashSet;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "codeforces";
        HashSet<Character> h = new HashSet<Character>();
        for(char i:s.toCharArray()){
            h.add(i);
        }
        int n=in.nextInt();
        for(int j=0;j<n;j++){
            String a=in.next();
            if(h.contains(a.charAt(0)))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
