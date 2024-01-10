import java.util.Scanner;

public class HW1_6 {
    /*Напишите программу, которая считывает неопределенное
    количество целых чисел, определяет сколько положительных и
    отрицательных значений были прочитаны, и вычислите общее и среднее
    значение чисел и выведите на экран*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0, i=0, sum = 0, pos = 0, neg = 0;
        double avg = 0;
        while(true){
            if(a==0)break;
            a=in.nextInt();
            if(a>0)pos++;
            else if(a<0)neg++;
            sum+=a;
            i++;
        }
        avg=1.0*sum/i;
        System.out.println("AVG = " + avg);
        System.out.println("POS = "+pos);
        System.out.println("NEG = "+neg);
    }
}
