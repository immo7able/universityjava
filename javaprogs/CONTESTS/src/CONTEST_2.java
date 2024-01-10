import java.util.Scanner;

public class CONTEST_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] c = new int[t];
        for(int i=0;i<t;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            if(a%b==0){
                c[i]=0;
            }else c[i]=b-(a%b);
        }
        for(int i=0;i<t;i++){
            System.out.println(c[i]);
        }
    }
}
