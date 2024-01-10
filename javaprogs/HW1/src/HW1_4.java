import java.util.Scanner;

public class HW1_4 {
    public static void main(String[] args) {
        /*(Найти будущие даты) Напишите программу, которая предлагает пользователю ввести целое число для
        сегодняшний день недели (воскресенье — 0, понедельник — 1, … и суббота — 6). Также предложить пользователю ввести количество дней после сегодняшнего дня для будущего дня и отобразить будущий день недели.*/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели = ");
        int a = in.nextInt();
        System.out.println("Введите количество прошедших дней");
        int b = in.nextInt();
        int c = (a+b)%7;
        switch(c){
            case 0:
                System.out.println("Воскресенье");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("Error");
        }
    }
}
