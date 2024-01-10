package HW6_3;

public class FerrariEngine extends Engine {
    public FerrariEngine(){}
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight){
        super(engineVolume, cylinderAmount, engineWeight);
    }
    @Override
    public double efficiency(){
        return 0.25;
    }
    public double throttleEnergy(){
        return engineVolume*cylinderAmount*100;
    }
    public double breakEnergy(){
        return engineWeight*2;
    }
}
