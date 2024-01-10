import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int[] a = new int[3];
            for(int j=0;j<3;j++){
                 a[j]=in.nextInt();
            }
            int min=a[0], max =a[0];
            for(int j=0;j<3;j++){
                if(a[j]>max)
                    max=a[j];
                if(a[j]<min)
                    min=a[j];
            }
            for(int j=0;j<3;j++){
                if(a[j]!=max&&a[j]!=min)
                    System.out.println(a[j]);
            }
        }
    }
}
