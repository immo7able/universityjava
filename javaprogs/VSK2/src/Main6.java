import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> set = new ArrayList<>();
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            if(set.contains(a)){
                set.remove(set.indexOf(a));
                set.add(a);
            }
            else set.add(a);
        }
        System.out.println(set.size());
        for(int i=0;i< set.size();i++)
            System.out.print(set.get(i)+" ");
    }
}
