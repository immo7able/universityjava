import java.util.Scanner;

public class TwoDimmArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][5];
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
