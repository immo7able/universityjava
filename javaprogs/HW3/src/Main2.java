import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.substring(0,1).equals(s.substring(0,1).toLowerCase())&&s.substring(1).equals(s.substring(1).toUpperCase()))
            s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        else if (s.equals(s.toUpperCase()))
            s=s.toLowerCase();
        System.out.println(s);
    }
}
