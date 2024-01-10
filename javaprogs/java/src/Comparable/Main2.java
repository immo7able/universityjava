package Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person messi = new Person("Leo", "Messi", 36, 72, "male", "Argentina");
        Person copyofMessi = messi.clone();
        System.out.println(messi.getName());
        System.out.println(copyofMessi.getName());
    }
}
