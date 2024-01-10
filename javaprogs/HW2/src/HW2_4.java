public class HW2_4 {
    public static double celsiusToFahrenheit(double celsius){
        return 9.0/5*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return 5.0/9*(fahrenheit-32);
    }
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(1));
        System.out.println(fahrenheitToCelsius(5));
    }
}
