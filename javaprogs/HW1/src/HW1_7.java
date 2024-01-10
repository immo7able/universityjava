import java.util.Scanner;

public class HW1_7 {
    /*Предположим, что плата за обучение в этом году составляет 10 000
    долларов и увеличивается на 5% каждый год. За первый год стоимость
    обучения составит 10 500 долларов.
    Напишите программу, которая вычисляет стоимость обучения за десять лет и
    определите общую стоимость обучения за все 10 лет после десятого года*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double sum = 0;
        for(int i=0;i<10;i++){
            a*=1.05;
            System.out.println((i+1)+": " + a);
            sum+=a;
        }
        System.out.println("Сумма= "+ sum);
    }
}
