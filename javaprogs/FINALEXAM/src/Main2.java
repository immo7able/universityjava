import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            long k=in.nextLong();
            long a=in.nextLong();
            long b=in.nextLong();
            if(a*2<b){
                System.out.println(k*a);
            }
            else {
                if(k%2==0)
                    System.out.println((k/2)*b);
                else
                    System.out.println((k/2)*b+a);
            }
        }
    }
}
