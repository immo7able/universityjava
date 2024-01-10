import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int i=0;
        while(n>0){
            while(n>=100){
                i+=n/100;
                n%=100;
            }
            while(n>=20){
                i+=n/20;
                n%=20;
            }
            while(n>=10){
                i+=n/10;
                n%=10;
            }
            while(n>=5){
                i+=n/5;
                n%=5;
            }
            while(n>=1){
                i++;
                n--;
            }
        }
        System.out.println(i);
    }
}
