import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n>=0)
            System.out.println(n);
        else{
            if((n/10-((n/10)%10)+n%10)>(n/10))
                System.out.println(n/10-((n/10)%10)+n%10);
            else
                System.out.println(n/10);
        }
    }
}
