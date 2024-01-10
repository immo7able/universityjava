import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String a="codeforces";
        for(int i=0;i<n;i++){
            int sum=0;
            String s=in.next();
            s=s.substring(0,10);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!=a.charAt(j))
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
