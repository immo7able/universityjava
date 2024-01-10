package HW6_3;

public class Main {
    public static void main(String[] args) {
        FerrariEngine a = new FerrariEngine(3, 6, 600);
        FerrariEngine b = new FerrariEngine(3.5, 6, 700);
        FerrariEngine c = new FerrariEngine(4, 8, 800);
        FerrariEngine d = new FerrariEngine(5, 10, 900);
        FerrariEngine e = new FerrariEngine(6, 12, 1000);
        RenaultEngine f = new RenaultEngine(3,6,600,10);
        RenaultEngine g = new RenaultEngine(3.5,6,700,15);
        RenaultEngine h = new RenaultEngine(4,8,800,20);
        RenaultEngine i = new RenaultEngine(5,10,900,25);
        RenaultEngine j = new RenaultEngine(6,12,1000,30);
        Engine[] engines = {a,b,c,d,e,f,g,h,i,j};
        for(Engine s: engines){
            System.out.println(s.getMaxSpeed());
        }
    }
}
