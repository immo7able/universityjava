import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {4,2,5,1,3};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                temp=a[j];
                if(a[j]<a[j-1]){
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
