public class MethodTest {
    public static void main(String[] args) {
        int result = sumofThree(5,4,10);
        System.out.println(result);
        long result2 = sumofThree(200, 100, 50);
        System.out.println(result2);
    }

    public static int sumofThree(int a, int b, int c){
        int sum=0;
        sum=a+b+c;
        return sum;
    }
    public static long sumofThree(long a, long b, long c){
        long sum=0;
        sum=a+b+c;
        return sum;
    }
}
