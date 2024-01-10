public class Selections {
    public static void main(String[] args) {
        int x=5;
        if(x==5) System.out.println("x=5");
        else System.out.println("x!=5");
        switch(x){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Default");
        }
        boolean b = x % 2 == 0 ? true : false;
        System.out.println(b);
    }
}
