import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),sum=0;
        if(n%2==0){
            sum+=n/2;
            System.out.println(sum);
            for(int i=0;i<n/2;i++){
                System.out.print(2+" ");
            }
        }
        else{
            n-=3;
            sum=n/2+1;
            System.out.println(sum);
            System.out.print(3+" ");
            for(int i=0;i<n/2;i++){
                System.out.print(2+" ");
            }
        }


    }
}
