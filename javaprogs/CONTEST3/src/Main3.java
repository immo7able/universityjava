import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),res=0;
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b=in.nextInt();
            if(a>b)
                res++;
            if(a<b)
                res--;
        }
        if(res>0)
            System.out.println("Mishka");
        else if (res<0)
            System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
