public class HW1_10 {
    /*Используйте цикл while, чтобы найти наименьшее целое число n
    такое, что n2 больше 12 000.*/
    public static void main(String[] args) {
        int n = 0;
        while(n*n<=12000){
            n++;
        }
        System.out.println(n);
    }
}
