import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        boolean bw=true;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                String s=in.next();
                if(s.charAt(0)=='C'||s.charAt(0)=='M'||s.charAt(0)=='Y')
                    bw=false;
            }
        }
        if(bw)
            System.out.println("#Black&White");
        else System.out.println("#Color");
    }
}
