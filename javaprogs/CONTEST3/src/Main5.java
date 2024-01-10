import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(), s1="";
        while(!s.isEmpty()){
            if(s.charAt(0)=='.') {
                s1 += '0';
                s=s.substring(1);
            }
            else if (s.charAt(0)=='-'&&s.charAt(1)=='.') {
                s1+='1';
                s=s.substring(2);
            }
            else {
                s1+='2';
                s=s.substring(2);
            }
        }
        System.out.println(s1);
    }
}
