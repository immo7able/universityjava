package Exceptions;

public class Triangle {
    int a;
    int b;
    int c;
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getPerimeter() throws NotTriangleException{
        if(a+b<=c || a+c<=b || c+b<=a)
            throw new NotTriangleException();
        int p = a+b+c;
        return p;
    }
}
