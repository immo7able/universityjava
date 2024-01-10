import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt(), v= in.nextInt(), sum=0;
        if(n<=v+1)
            System.out.println(n-1);
        else{
            int i=1;
            sum+=v*i;
            while(n>0){
                i++;
                if(n>v+1){
                    sum+=i;
                }
                n--;
            }
            System.out.println(sum);
        }
    }
}
