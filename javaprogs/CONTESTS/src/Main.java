import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String[] b = new String[a];
        for(int i=0;i<a;i++){
            b[i]=in.next();
            if(b[i].length()>10)
                //b[i]=b[i].toCharArray()[0]+b[i].length()+b[i].toCharArray()[b[i].length()];
            System.out.println(b[i].toCharArray()[b[i].length()]);
        }
    }
}