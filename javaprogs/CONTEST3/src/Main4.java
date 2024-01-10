import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                a[j]=in.nextInt();
            }
            int max=a[0], sum=0;
            for(int j=0;j<4;j++){
                if(max<a[j])
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
