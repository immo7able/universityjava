package HW6_2;

public class Main {
    public static void main(String[] args) {
        SphereGold a = new SphereGold(1);
        SphereGold b = new SphereGold(2);
        SphereGold c = new SphereGold(3);
        CubeGold d = new CubeGold(1);
        CubeGold e = new CubeGold(2);
        CubeGold f = new CubeGold(3);
        GoldShape[] figures = {a,b,c,d,e,f};
        for(GoldShape i: figures){
            System.out.println(i.getPrice());
        }
    }
}
