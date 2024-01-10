import java.util.Scanner;

public class MT1_3 {
    public static long getMod (long a, long b){
        long mod=1;
        for(int i=0;i<b;i++){
            mod*=a;
        }
        return mod;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println(getMod(a,b));
    }
}
