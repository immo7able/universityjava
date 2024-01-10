import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt(), odd=0, even=0;
            int[] a=new int[n];
            for(int j=0;j<n;j++){
                a[j]=in.nextInt();
                if(a[j]%2==1)
                    odd++;
                else even++;
            }
            if(even>0) {
                for (int j = 0; j < n; j++) {
                    if (a[j] % 2 == 0) {
                        System.out.println(1);
                        System.out.println(j + 1);
                        break;
                    }
                }
            }
            else if(odd>=2){
                int sum=0;
                System.out.println(2);
                for(int j=0;j<n;j++){
                    if(a[j]%2==1){
                        System.out.print(j+1+" ");
                        sum++;
                    }
                    if(sum==2)
                        break;
                }
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
