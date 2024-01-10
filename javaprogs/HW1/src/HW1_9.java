import java.util.Scanner;

public class HW1_9 {
    /*Напишите программу, которая считывает целые числа, находит
    наибольшее из них и подсчитывает их вхождения. Предположим, что ввод
    заканчивается числом 0.
    Предположим, вы ввели 3 5 2 5 5 5 0; программа находит, что наибольшее
    значение равно 5, а количество вхождений для 5 равно 4.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0, i = 0;
        while(true){
            int a = in.nextInt();
            if(a==0)break;
            if(a>max){
                max=a;
                i=0;
            }
            if(max==a)i++;
        }
        System.out.println(max+" "+i);
    }
}
