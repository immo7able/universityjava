import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int max=a[0], min=a[0], sum=0;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                sum++;
            } else if (min>a[i]) {
                min=a[i];
                sum++;
            }
        }
        System.out.println(sum);
    }
}
