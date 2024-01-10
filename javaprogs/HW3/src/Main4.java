import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt(), res=0;
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            if(a[i]%2==0)
                res++;
            else res--;
        }
        for(int i=0;i<n;i++){
            if(res<0){
                if(a[i]%2==0)
                    System.out.println(i+1);
            }
            else{
                if(a[i]%2!=0)
                    System.out.println(i+1);
            }
        }
    }
}
