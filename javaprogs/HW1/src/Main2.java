import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            for(int j=0;j<8;j++){
                for(int k=0;k<8;k++){
                    char x = in.next().charAt(0);
                    if(x!='.')
                        System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}
