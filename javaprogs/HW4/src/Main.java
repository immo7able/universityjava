import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        String[] s = new String[a];
        for(int i=0;i<a;i++){
            s[i]=in.next();
            String temp= s[i].charAt(0)+"";
            String temp2 = s[i].substring(1, s[i].length()-1);
            for(int j=0;j<temp2.length();j=j+2){
                temp+=temp2.charAt(j);
            }
            temp+=s[i].charAt(s[i].length()-1);
            System.out.println(temp);
        }
    }
}