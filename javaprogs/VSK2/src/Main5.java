import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            int b=in.nextInt()+in.nextInt();
            if(a<=b){
                System.out.println(a+a-1);
            }
            else System.out.println(b+b+1);
        }
    }
}
