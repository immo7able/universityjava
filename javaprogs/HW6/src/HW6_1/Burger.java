package HW6_1;

public class Burger extends Food{
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
