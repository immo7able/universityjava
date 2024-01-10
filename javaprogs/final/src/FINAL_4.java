public class FINAL_4 {
    public static void main(String[] args) {
        Chocolate a = new Chocolate("Snickers", 1);
        Chocolate b = new Chocolate("Twix", 2);
        Burger c = new Burger("Burger King", 1, 2);
        Burger d = new Burger("McDonalds", 2, 1);
        Coke e = new Coke("Coca-Cola", 1, true);
        Coke f = new Coke("Fuse-tea", 1, false);
        Food[] food = {a,b,c,d,e,f};
        int count=0;
        double max=0;
        for(int i=0;i<food.length;i++){
            System.out.println(food[i].getName()+" "+food[i].getCalories());
            if(food[i].getCalories()>max){max=food[i].getCalories();count=i;}
        }
        System.out.println("Max = " + food[count].getName()+" "+food[count].getCalories());
    }
}
abstract class Food{
    String name;
    public Food(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    abstract double getCalories();
}
class Chocolate extends Food{
    int weight;
    public Chocolate(String name){
        super(name);
    }
    public Chocolate(String name, int weight){
        super(name);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public double getCalories(){
        return weight*740;
    }
}
class Burger extends Food{
    int meatAmount;
    int meatType;
    public Burger(String name){
        super(name);
    }
    public Burger(String name, int meatAmount, int meatType){
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }
    public int getMeatAmount() {
        return meatAmount;
    }
    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }
    public int getMeatType() {
        return meatType;
    }
    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }
    @Override
    public double getCalories(){
        if(meatType == 1) return meatAmount*840;
        else return meatAmount*560;
    }
}
class Coke extends Food{
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