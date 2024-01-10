package CONTEST_TEST;

import java.util.Scanner;

public class CONTEST2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int q = 0, sum = 0;
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < t; i++){
            for (int j = 1; j < t - i; j++){
                if (a[j] < a[j - 1]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        for(int i=0;i<t;i++){
            if((a[i]+a[i+1])%4==0){
                
            }
        }
    }
}