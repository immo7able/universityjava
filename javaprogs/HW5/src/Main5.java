import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a="qwertyuiop";
        String b="asdfghjkl;";
        String c="zxcvbnm,./";
        Character k=in.next().charAt(0);
        String s=in.next();
        String result="";
        if(k=='R'){
            for(int i=0;i<s.length();i++){
                if(a.contains(s.charAt(i)+""))
                    result+=a.charAt(a.indexOf(s.charAt(i))-1);
                else if(b.contains(s.charAt(i)+""))
                    result+=b.charAt(b.indexOf(s.charAt(i))-1);
                else if(c.contains(s.charAt(i)+""))
                    result+=c.charAt(c.indexOf(s.charAt(i))-1);
            }
        }
        if(k=='L'){
            for(int i=0;i<s.length();i++){
                if(a.contains(s.charAt(i)+""))
                    result+=a.charAt(a.indexOf(s.charAt(i))+1);
                else if(b.contains(s.charAt(i)+""))
                    result+=b.charAt(b.indexOf(s.charAt(i))+1);
                else if(c.contains(s.charAt(i)+""))
                    result+=c.charAt(c.indexOf(s.charAt(i))+1);
            }
        }
        System.out.println(result);
    }
}
