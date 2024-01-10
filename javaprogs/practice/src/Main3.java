import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            int s=in.nextInt();
            HashSet<Integer> numbers = new HashSet<>();
            for(int j=0;j<k;j++){
                numbers.add(in.nextInt());
            }
            int j=1;
            while (s!=0) {
                if(s<0||j>s){
                    System.out.println("NO");
                    break;
                }
                if(numbers.contains(j))
                    j++;
                else if(s-j>=0){
                    s-=j;
                    numbers.add(j);
                }
            }

            if(s==0){
                for(j=1;j<=numbers.size();j++){
                    if(!numbers.contains(j)){
                        System.out.println("NO");
                        break;
                    }
                    if(j==numbers.size())
                        System.out.println("YES");
                }
            }
        }
    }
}
