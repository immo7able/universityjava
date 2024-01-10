import java.util.Scanner;

public class FINAL_1 {
    /*Напишите программу, которая считывает неопределенное количество целых чисел,
    определяет сколько положительных и отрицательных значений были прочитаны, и
    вычислите общее и среднее значение чисел и выведите на экран*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positive=0, negative=0;
        double sum=0;
        while(true){
            int i=in.nextInt();
            if(i==0)break;
            else{
                sum+=i;
                if(i>0){
                    positive++;
                }if(i<0){
                    negative++;
                }
            }
        }
        System.out.println("Меньше 0 = " + negative);
        System.out.println("Больше 0 = " + positive);
        System.out.println("Сумма = " + sum);
        if(sum==0){
            System.out.println("Среднее = 0");
        }else
            System.out.println("Среднее = " + sum/(positive+negative));
    }
}
