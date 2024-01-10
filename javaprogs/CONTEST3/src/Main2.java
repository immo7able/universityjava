import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a = new int[n], b=new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            for(int j=1;;j++){
                if(j%3==0||j%10==3)
                    continue;
                a[i]--;
                if(a[i]==0){
                    b[i]=j;
                    break;
                }
            }
        }
        for (int i=0;i<n;i++)
            System.out.println(b[i]);
    }
}