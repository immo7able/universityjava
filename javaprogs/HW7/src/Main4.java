import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt();
        List<Integer> c = new ArrayList<Integer>();
        boolean d = false;
        c.add(b);
        while(b>a){
            if(b%10==1){
                b/=10;
                c.add(b);
            }
            else if(b%2==0){
                b/=2;
                c.add(b);
            }
            else {
                break;
            }
        }
        if(b==a){
            System.out.println("YES");
            System.out.println(c.size());
            for(int i=c.size()-1;i>=0;i--){
                System.out.print(c.get(i)+" ");
            }
        }
        else
            System.out.println("NO");
    }
}
