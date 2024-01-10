
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a=new int[3];
        for(int i=0;i<n;i++){
            int k=in.nextInt(), sum=0;
            for(int j=0;j<3;j++){
                a[j]=in.nextInt();
            }
            boolean z=true;
            while(z){
                for(int j=0;j<3;j++){
                    if(j==k-1) {
                        k = a[j];
                        sum++;
                    }
                    if(sum==3){
                        System.out.println("YES");
                        z=false;
                        break;
                    }
                    else if(k==0&&sum<3) {
                        System.out.println("NO");
                        z=false;
                        break;
                    }
                }
            }
        }
    }
}