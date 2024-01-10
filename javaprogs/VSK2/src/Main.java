import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(), min = Integer.MAX_VALUE;
        int[] path = new int[4];
        path[0]=2*a+2*b;
        path[1]=2*a+2*c;
        path[2]=2*b+2*c;
        path[3]=a+b+c;
        for(int i=0;i<path.length;i++){
            if(path[i]<min)
                min=path[i];
        }
        System.out.println(min);
    }
}