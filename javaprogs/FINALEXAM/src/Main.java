import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(in.nextInt());
        }
        int k=in.nextInt();
        for(int i=0;i<k;i++){
            b.add(in.nextInt());
        }
        int i=0, j=0;
        while(true){
            int temp=a.get(i)+b.get(j);
            if(a.contains(temp)||b.contains(temp)){
                if(j==k-1){
                    i++;
                    continue;
                }
                j++;
            }
            else {
                System.out.println(a.get(i)+" "+b.get(j));
                break;
            }
        }
    }
}