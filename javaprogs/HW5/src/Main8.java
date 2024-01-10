import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k = in.nextInt();
            String a=in.next().substring(0,k);
            String b=in.next().substring(0,k);
            a=a.replace('G','B');
            b=b.replace('G','B');
            boolean error=false;
            for(int j=0;j<k;j++){
                if(a.charAt(j)!=b.charAt(j))
                    error=true;
            }
            if(error)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
