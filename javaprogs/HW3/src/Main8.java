import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), k=in.nextInt(), sum=240-k,i=0;
        while(sum>=0){
            i++;
            sum-=i*5;
        }
        if(i>n)
            System.out.println(n);
        else
            System.out.println(i-1);
    }
}
