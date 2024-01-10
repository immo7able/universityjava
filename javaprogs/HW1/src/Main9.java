import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=n+1;
        while(true){
            int a=i%10, b=(i/10)%10, c=(i/100)%10, d=(i/1000)%10;
            if(a==b||b==c||c==d||a==c||a==d||b==d){
                i++;
            }
            else{
                System.out.println(i);
                break;
            }
        }
    }
}
