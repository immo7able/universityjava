package HW6_2;

public class CubeGold extends GoldShape{
    double side;
    public CubeGold(){}
    public CubeGold(double side){
        this.side = side;
    }
    @Override
    public double getVolume(){
        return Math.pow(side, 3);
    }
}
