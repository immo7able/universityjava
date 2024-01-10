import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n= in.nextInt();
            String s=in.next();
            s=s.substring(0,n);
            if(s.contains("T")&&s.contains("i")&&s.contains("m")&&s.contains("u")&&s.contains("r")&&s.length()==5)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
