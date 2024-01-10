import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            System.out.println("Hello! "+i);
        }
        int x=0;
        while(x<10) {
            System.out.println("Hello " + x);
            x++;
        }
        int a=0;
        do{
            System.out.println("Hi");
            a++;
        }while(a<10);
        int[] arr = new int[5];
        Scanner in= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        for(int c: arr){ //foreach
            System.out.println(c + " ");
        }
    }
}
