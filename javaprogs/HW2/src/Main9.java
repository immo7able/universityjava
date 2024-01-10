import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c = "";
        String d= " ";
        for(int i = 1; i <= n; i++){
            if(i%2 == 1){
                c = "I hate";
            }else {
                c = "I love";
            }
            if(i <  n){
                d = "that";
            } else{
                d = "it";
            }
            System.out.print(c + " "+ d + " ");
        }
    }
}