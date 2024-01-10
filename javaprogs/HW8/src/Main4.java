import java.util.Scanner;

public class Main4 {
    public static int count(int i, int j, int r, int c){
        if(i<1||j<1||i>r||j>c){
            return 0;
        }
        else return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int r=in.nextInt();
            int c=in.nextInt();
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            int a=count(x1, y1+1, r, c)+count(x1, y1-1, r, c)+count(x1+1, y1, r, c)+count(x1-1, y1, r, c);
            int b=count(x2, y2+1, r, c)+count(x2, y2-1, r, c)+count(x2+1, y2, r, c)+count(x2-1, y2, r, c);
            if(a<b)
                System.out.println(a);
            else System.out.println(b);
        }
    }
}
