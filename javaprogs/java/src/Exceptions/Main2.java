package Exceptions;

public class Main2 {
    public static void main(String[] args) {
        Triangle t1=new Triangle(3,4,5);
        try{
            System.out.println(t1.getPerimeter());
        }catch (NotTriangleException e){

        }
        Triangle t2=new Triangle(1,2,10);
        try{
            System.out.println(t2.getPerimeter());
        }catch (NotTriangleException e){

        }
    }
}
