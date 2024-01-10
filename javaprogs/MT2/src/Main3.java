import java.sql.SQLOutput;

public class Main3 {
    public static void main(String[] args) {
        try{
            Rectangle a = new Rectangle(1,2);
            System.out.println(a.toString()+" создан");
        }catch(TooSmallSideRectangleException e){}
        try{
            Rectangle b = new Rectangle(10,10);
            System.out.println(b.toString()+" создан");
        }catch(TooSmallSideRectangleException e){}
        try{
            Rectangle c = new Rectangle(9,11);
            System.out.println(c.toString()+" создан");
        }catch(TooSmallSideRectangleException e){}
        try{
            Rectangle d = new Rectangle(11,9);
            System.out.println(d.toString()+" создан");
        }catch(TooSmallSideRectangleException e){}
        try{
            Rectangle e = new Rectangle(11,11);
            System.out.println(e.toString()+" создан");
        }catch(TooSmallSideRectangleException e){}
    }
}
class Rectangle{
    int a;
    int b;

    public Rectangle(int a, int b) throws TooSmallSideRectangleException{
        if(a<10||b<10) throw new TooSmallSideRectangleException();
        else{
            this.a = a;
            this.b = b;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    @Override
    public String toString(){
        return "A: "+this.getA()+" B: "+this.getB();
    }
}
class TooSmallSideRectangleException extends Exception{
    public TooSmallSideRectangleException(){
        System.out.println("Side length can not be so small");
    }
}