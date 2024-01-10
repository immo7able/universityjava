package HW5_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen","Passat",200, 2005, 2.0);
        Mercedes mercedes = new Mercedes("Mercedes","E63", 250, 2010, 6.3, "E");
        Toyota toyota = new Toyota("Toyota","Corolla",200, 2002, 1.6, "Japan");
        Car[] cars = {car, mercedes, toyota};
        for(int i=0;i<cars.length;i++){
            cars[i].ride();
        }
    }
}