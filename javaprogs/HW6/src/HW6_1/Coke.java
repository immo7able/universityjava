package HW6_1;

public class Coke extends Food{
    double volumeLiters;
    boolean isSparkling;
    public Coke(String name){
        super(name);
    }
    public Coke(String name, double volumeLiters, boolean isSparkling){
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    public double getCalories(){
        if(isSparkling == true) return volumeLiters*400;
        else return volumeLiters*100;
    }
}
