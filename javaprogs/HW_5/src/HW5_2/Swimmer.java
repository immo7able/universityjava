package HW5_2;

public class Swimmer extends Sportsman{
    String style;
    double recordTime;
    public Swimmer(){}
    public Swimmer(String fullName, int age, String country, String style, double recordTime){
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    @Override
    public void play(){
        System.out.println("Swimmer {"+fullName+";"+age+";"+country+";"+style+";"+recordTime+"}");
    }
}
