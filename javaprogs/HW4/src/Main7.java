import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            String s = in.next();
            if(s.length()%2==0)
                if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2)))
                    System.out.println("YES");
                else System.out.println("NO");
            else System.out.println("NO");
        }
    }
}
