import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String s =in.next();
            ArrayList<Character> keys = new ArrayList<>();
            boolean a=true;
            int j=0;
            for(char c: s.toCharArray()){
                if(c=='r'){
                    keys.add(c);}
                else if (c=='g') {
                    keys.add(c);
                } else if (c=='b') {
                    keys.add(c);
                } else if (c=='R'&&!keys.contains(Character.toLowerCase(c))){
                        System.out.println("NO");
                        a=false;
                        break;
                }else if (c=='G'&&!keys.contains(Character.toLowerCase(c))){
                        System.out.println("NO");
                        a=false;
                        break;
                }else if (c=='B'&&!keys.contains(Character.toLowerCase(c))) {
                    System.out.println("NO");
                    a = false;
                    break;
                }
                j++;
                if(j==6&&a)
                    System.out.println("YES");
            }
        }
    }
}
