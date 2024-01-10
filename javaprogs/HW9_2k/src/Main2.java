import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String[] s = new String[3];
            Character[][] s1 = new Character[3][3];
            for(int j=0;j<3;j++){
                s[j] = in.next();
                for(int k=0;k<3;k++){
                    s1[j][k]=s[j].charAt(k);
                }
            }
        }
    }
}
