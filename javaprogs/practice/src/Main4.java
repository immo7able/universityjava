import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int b=in.nextInt();
            int p=in.nextInt();
            int f=in.nextInt();
            int h=in.nextInt();
            int c=in.nextInt();
            int sum=0;
            if(b>1){
                b/=2;
                if(h>c){
                    if(b>p){
                        sum+=p*h;
                        b-=p;
                        if(b>f){
                            sum+=f*c;
                        }
                        else sum+=b*c;
                    }
                    else{
                        sum+=b*h;
                    }
                }
                else{
                    if(b>f){
                        sum+=f*c;
                        b-=f;
                        if(b>p){
                            sum+=p*h;
                        }
                        else sum+=b*h;
                    }
                    else{
                        sum+=b*c;
                    }
                }
                System.out.println(sum);
            }
            else System.out.println(0);
        }
    }
}
