import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args) {
        /*3) (Сумма цифр целого числа) Напишите программу, которая считывает целое число от 0 до 1000 и складывает все цифры целого числа. Например, если целое число равно 932,
              сумма всех его цифр равна 14.*/
        Scanner in = new Scanner(System.in);
        double x=(int)(Math.random()*((1000-0)+1)-0);
        System.out.println("Число = " + x);
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        System.out.println("Сумма = " + sum);
    }
}
