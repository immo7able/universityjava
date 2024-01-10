package HW6_2;

public class SphereGold extends GoldShape{
    double radius;
    public SphereGold(){}
    public SphereGold(double radius){
        this.radius = radius;
    }
    @Override
    public double getVolume(){
        return  4.0/3.0*Math.PI*Math.pow(radius, 3);
    }
}
