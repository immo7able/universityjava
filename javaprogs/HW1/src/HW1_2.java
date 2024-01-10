import java.util.Scanner;

public class HW1_2 {
    public static void main(String[] args) {
        /*2) (Вычислите объем цилиндра) Напишите программу, которая читает по радиусу и длину цилиндра и вычисляет площадь и объем, используя следующую формулу:
        площадь = радиус * радиус * p
        объем = площадь * длина*/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус = ");
        double r = in.nextDouble();
        System.out.println("Введите длину = ");
        double l = in.nextDouble();
        double S = r * r * Math.PI;
        double V = S * l;
        System.out.println("Площадь = "+S+" Объем = "+ V);
    }
}
