import java.util.Scanner;

public class FINAL_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0, quantity=in.nextInt();
        if(quantity<=0){
            System.out.println("Неправильное количество");
        }else{
            double max=0;
            String[] name = new String[quantity];
            double[] gpa = new double[quantity];
            for(int i=0;i<quantity;i++){
                name[i] = in.next();
                gpa[i] = in.nextDouble();
                if(gpa[i]>max) {
                    count = i;
                    max=gpa[i];
                }
            }
            System.out.println(name[count]+" "+gpa[count]);
        }
    }
}
