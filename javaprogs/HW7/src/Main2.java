import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();
        String[] a = new String[n];
        Character[][] b = new Character[n][m];
        for(int i=0;i<n;i++){
            a[i]=in.next();
            for(int j=0;j<m;j++){
                if(a[i].charAt(j)=='.'){
                    if((i+j)%2==0)
                        b[i][j]='B';
                    else b[i][j]='W';
                }
                else b[i][j]='-';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
