import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String[] s=new String[3];
            Character[][] c = new Character[3][3];
            Character cc='.';
            int a=0;
            for(int j=0;j<3;j++) {
                s[j] = in.next();
                for (int k = 0; k < 3; k++) {
                    c[j][k] = s[j].charAt(k);
                }
            }
            if (c[0][0]==c[1][1]&&c[1][1]==c[2][2]&&c[0][0]!='.'){
                cc = c[0][0];
            }
            else if (c[0][2]==c[1][1]&&c[1][1]==c[2][0]&&c[0][2]!='.'){
                cc = c[0][2];
            }
            else{
                for(int j=0;j<3;j++){
                    if(c[j][0]==c[j][1]&&c[j][1]==c[j][2]&&c[j][0]!='.'){
                        cc=c[j][0];
                        break;
                    }
                    else if(c[0][j]==c[1][j]&&c[1][j]==c[2][j]&&c[0][j]!='.'){
                        cc=c[0][j];
                        break;
                    }
                    else a++;
                }
            }
            if(a==3||cc=='.')
                System.out.println("DRAW");
            else System.out.println(cc);
        }
    }
}