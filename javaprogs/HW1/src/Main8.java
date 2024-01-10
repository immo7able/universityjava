import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int i=0,sum=0;
        for(int j=0;j<n;j++){
            i = in.nextInt();
            if(i>h)
                sum+=2;
            else sum+=1;
        }
        System.out.println(sum);
    }
}
