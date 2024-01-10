package Exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int a =20;
        int b =0;
        int div = -1;
        try{
            div = divBy(a,b);
        }catch(ArithmeticException e){
            System.out.println("Exception is caught");
            div = -2;
        }catch(IOException e){
            System.out.println("IOException is caught");
        }finally{
            System.out.println("Finally this is it");
        }
        System.out.println("Div a/b is "+div);
    }
    public static int divBy(int a, int b) throws IOException{
        if(b==0) throw new ArithmeticException();
        if(a==0) throw new IOException();
        int div = a/b;
        return div;
    }
}
