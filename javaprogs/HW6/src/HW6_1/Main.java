package HW6_1;

public class Main {
    public static void main(String[] args) {
        Chocolate twix = new Chocolate("Twix",1);
        Chocolate snickers = new Chocolate("Snickers",2);
        Burger bk = new Burger("Burger King",1, 1);
        Burger mc = new Burger("McDonalds",2, 2);
        Coke cola = new Coke("Coca-Cola",1, true);
        Coke fuse = new Coke("Fuse tea",2, false);
        Food[] food = {twix, snickers, bk, mc, cola, fuse};
        double max = 0;
        for(Food a:food){
            if(a.getCalories()>max)max = a.getCalories();
            System.out.println(a.name+" "+a.getCalories());
        }
        System.out.println("Max = "+max);
    }
}
