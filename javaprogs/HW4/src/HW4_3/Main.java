package HW4_3;

import javax.lang.model.element.TypeElement;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        MyString string = new MyString("Ya_Ne_Ochen'_Ponyal_Zadanie");
        System.out.println(string.compare("Ya_Ne_Ochen'_Ponyal_Zadanie1"));
        System.out.println(string.toString());
        System.out.println(string.toUpperCase());
        System.out.println(string.toChars());
    }
}
