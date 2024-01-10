import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean b = false;
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            if(a==1)
                b=true;
        }
        if(b)
            System.out.println("HARD");
        else System.out.println("EASY");
    }
}
