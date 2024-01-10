import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int sum=0;
            while(x>0){
                String s = x+"";
                sum+=s.length();
                if(x<10){
                    x--;
                    x*=1111;
                }else x/=10;
            }
            System.out.println(sum);
        }
    }
}
