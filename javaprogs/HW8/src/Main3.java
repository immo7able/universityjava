import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a = new int[n];
        boolean istrue = false;
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            if (a[a[a[i]-1]-1] == i + 1) {
                istrue = true;
                break;
            }
        }
        if(istrue)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
