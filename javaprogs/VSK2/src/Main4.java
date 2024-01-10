import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt(), max=0;
        int[] a = new int[n], sum=new int[3];
        int j=0;
        for(int i=0;i<n;i++) {
            if(j==0){
                sum[j]+=in.nextInt();
                j++;}
            else if(j==1){
                sum[j]+=in.nextInt();
                j++;}
            else if(j==2){
                sum[j]+=in.nextInt();
                j=0;}
        }
        if(sum[0]>sum[1]&&sum[0]>sum[2]){
            System.out.println("chest");
        }
        else if(sum[1]>sum[2]&&sum[1]>sum[0])
            System.out.println("biceps");
        else System.out.println("back");
    }
}
