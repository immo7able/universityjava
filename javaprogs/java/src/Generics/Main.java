package Generics;

public class Main {
    public static void main(String[] args) {
        Integer a = new Integer(15);
        Integer b = new Integer(17);
        String c = "ABC";
        check(a,b,c);

        Double aa = new Double(1.5);
        Double bb = new Double(2.7);
        String cc = "CDE";
        check(aa,bb,cc);
    }
    public static <T, U> void check(T a, T b, U c){
        System.out.println(a+" "+b+" "+c);
    }
    /*public static void check(Integer a, Integer b){
        System.out.println(a+" "+b);
    }
    public static void check(Double a, Double b){
        System.out.println(a+" "+b);
    }*/
}
