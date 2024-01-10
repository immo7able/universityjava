import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String c = "";
        for(int i = 0; i <a.length(); i++){
            int s = a.charAt(i);
            int d = b.charAt(i);
            if(s != d){
                c = "1";
            }else{
                c= "0";
            }
            System.out.print(c);
        }
    }
}