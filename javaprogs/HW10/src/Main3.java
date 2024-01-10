import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ahmad", 21);
        map.put("Sanjar", 20);
        map.put("Zhibek", 19);
        map.put("Timur", 18);
        map.put("Samuel", 17);
        map.put("Nikita", 21);
        map.put("Ivan", 22);
        map.put("Gleb", 20);
        map.put("Daniil", 18);
        map.put("Andrey", 19);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
