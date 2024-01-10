import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args) {
        /*1) (Преобразовать градусы Цельсия в градусы Фаренгейта) Напишите программу, которая считывает градусы Цельсия из консоли, затем преобразует его в градусы Фаренгейта и отображает
        результат. Формула преобразования выглядит следующим образом:
        Фаренгейты = (9/5) * Цельсий + 32
        Подсказка: в Java 9/5 равно 1, а 9.0/5 равно 1,8.*/
        Scanner in = new Scanner(System.in);
        int celcius = in.nextInt();
        double fahrenheit = 1.0 * 9/5 * celcius + 32;
        System.out.println(fahrenheit);
    }
}
