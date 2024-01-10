import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int max=0;
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
            if(a[i]>max)
                max=a[i];
        }

        if(max!=0){
            for(int i=0;i<a.length;i++){
                if(a[i]==max){
                    switch (i){
                        case 0:
                            if(max==a[1]&&max==a[2])
                                System.out.println(0);
                            else if(max-a[1]-a[2]>=0)
                                System.out.println(max-a[1]-a[2]+1);
                            else System.out.println(0);
                            break;
                        case 1:
                            if(max-a[0]-a[2]>=0)
                                System.out.println(max-a[0]-a[2]+1);
                            else System.out.println(0);
                            break;
                        case 2:
                            if(max-a[0]-a[1]>=0)
                                System.out.println(max-a[0]-a[1]+1);
                            else System.out.println(0);
                            break;
                        default:
                            System.out.println(0);
                            break;
                    }
                    break;
                }
            }
        }
        else System.out.println(0);
    }
}
