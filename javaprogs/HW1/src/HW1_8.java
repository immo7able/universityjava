import java.util.Scanner;

public class HW1_8 {
    /*Напишите программу, которая предлагает пользователю ввести
    количество учеников, имя и оценку каждого ученика и отображает имя
    ученика с наивысшим баллом*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] name = new String[n];
        double[] gpa = new double[n];
        double max=0;
        int index = 0;
        for(int i=0;i<n;i++){
            name[i] = in.next();
            gpa[i] = in.nextInt();
            if(gpa[i]>max){
                max=gpa[i];
                index = i;
            }
        }
        System.out.println(name[index]+" "+gpa[index]);
    }
}
