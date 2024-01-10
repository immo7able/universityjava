import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), sum=0;
        String s = in.next();
        s=s.substring(0,n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
                sum++;
            else sum--;
        }
        if(sum>0)
            System.out.println("Anton");
        else if (sum<0) {
            System.out.println("Danik");
        }else System.out.println("Friendship");
    }
}
