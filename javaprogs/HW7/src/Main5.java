import java.util.Scanner;

public class Main5 {
    public static int wolf(int i, int j, int n, int k, Character[][] b){
        if(i<0||j<0||i==n||j==k){
            return 0;
        }
        if(b[i][j]=='W'){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        String[] a = new String[n];
        Character[][] b = new Character[n][k];
        boolean c = false;
        for(int i=0;i<n;i++){
            a[i]=in.next();
            for(int j=0;j<k;j++){
                b[i][j]=a[i].charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            if(c)
                break;
            for(int j=0;j<k;j++){
                if(b[i][j]=='.')
                    b[i][j]='D';
                else if(b[i][j]=='S'){
                    if((wolf(i, (j+1), n, k, b)+wolf(i, (j-1), n, k, b)+wolf((i+1), j, n, k, b)+wolf((i-1), j, n, k, b))!=0) {
                        c=true;
                        break;
                    }
                }
            }
        }
        if(!c){
            System.out.println("Yes");
            for(int i=0;i<n;i++){
                for(int j=0;j<k;j++){
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }
        }else System.out.println("No");
    }

}
