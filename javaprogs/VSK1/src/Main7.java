import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), sum=0, k =0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int l=n;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                sum++;
            }
            else{
                k=i;
                break;
            }
        }
        for(int i=n-1;i>=0;--i){
            if(a[i]==1){
                sum++;
            }
            else{
                l=i;
                break;
            }
        }
        for(int i=k;i<=l;i++){
            a[i]=1-a[i];
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
