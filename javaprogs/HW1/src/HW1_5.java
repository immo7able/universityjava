import java.util.Scanner;

public class HW1_5 {
    public static void main(String[] args) {
        /*Напишите программу, которая предлагает пользователю ввести три целых числа и отображать целые числа в неубывающем порядке*/
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        int res=0;
        for(int i=0;i<3;i++){
            arr[i] = in.nextInt();
        }
        for(int j=1;j<3;j++){
            for(int i=1;i<3;i++){
                if(arr[i]<arr[i-1]){
                    res=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=res;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
