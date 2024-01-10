import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            String s = in.next().substring(0,k);
            HashSet<Character> even = new HashSet<>();
            HashSet<Character> odd = new HashSet<>();
            for(int j=0;j<k;j++){
                if(j%2==0){
                    if(!odd.isEmpty()&&odd.contains(s.charAt(j))){
                        System.out.println("NO");
                        break;
                    }
                    else{
                        even.add(s.charAt(j));
                    }
                }
                else{
                    if(!even.isEmpty()&&even.contains(s.charAt(j))){
                        System.out.println("NO");
                        break;
                    }
                    else{
                        odd.add(s.charAt(j));
                    }
                }
                if(j==k-1)
                    System.out.println("YES");
            }
        }
    }
}