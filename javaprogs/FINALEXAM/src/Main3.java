import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            int b=in.nextInt();
            if(a.contains(b)){
                a.remove(a.indexOf(b));
                a.add(b);
            }else a.add(b);
        }
        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
