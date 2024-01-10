package OOP_Object;

public class Main {
    public static void main(String[] args) {
        Person Marina = new Person("Marina", "Kovaleva", 18);
        //Marina.accept("Marina", "Kovaleva", 18, 50);
        Person Lyazzat = new Person("Lyazzat", "Shukey", 18, 70);
        Marina.setWeight(50);
        System.out.println(Marina.getName()+ " " +Marina.getWeight());
        System.out.println(Lyazzat.getName()+" "+Lyazzat.getWeight());
    }
}
